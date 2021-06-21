package lk.easyCar.controller;

import lk.easyCar.dto.DriverDTO;
import lk.easyCar.dto.VehicleDTO;
import lk.easyCar.entity.Rent;
import lk.easyCar.exception.NotFoundException;
import lk.easyCar.service.VehicleService;
import lk.easyCar.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
   private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity SaveVehicle(@RequestBody VehicleDTO vehicleDTO){
        if (vehicleDTO.getCarID().trim().length()<=0){
            throw new NotFoundException("Vehicle id Cannot to be null");

        }

        vehicleService.addVehicle(vehicleDTO);
        return new ResponseEntity(new StandardResponse("201","Done",vehicleDTO), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity allVehicles(){
        ArrayList<VehicleDTO> allVehicles = vehicleService.getAllVehicles();

        return new ResponseEntity(new StandardResponse("200","Done",allVehicles),  HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchDriver(@PathVariable String id){

      VehicleDTO vehicleDTO =  vehicleService.searchVehicle(id);

        return new ResponseEntity(new StandardResponse("200","Done",vehicleDTO), HttpStatus.OK);

    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity deleteVehicle(@PathVariable String id){

        vehicleService.deleteVehicle(id);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }

    @PutMapping
    public ResponseEntity updateVehicle(@RequestBody VehicleDTO vehicleDTO){
        if (vehicleDTO.getCarID().trim().length()<=0){
            throw new NotFoundException("VNo ID Provider Update");

        }
        vehicleService.updateVehicle(vehicleDTO);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }



}
