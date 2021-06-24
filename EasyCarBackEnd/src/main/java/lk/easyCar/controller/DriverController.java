package lk.easyCar.controller;

import lk.easyCar.dto.DriverDTO;
import lk.easyCar.dto.RentDTO;
import lk.easyCar.exception.NotFoundException;
import lk.easyCar.service.DriverService;
import lk.easyCar.service.impl.DriverServiceImpl;
import lk.easyCar.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping
    public ResponseEntity saveDriver(@RequestBody DriverDTO dto){
        if (dto.getDriver_NIC().trim().length()<=0){
            throw new NotFoundException("Driver id Cannot to be null");
        }
        driverService.addDriver(dto);

        return new ResponseEntity(new StandardResponse("201","Done",dto), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity allDrivers(){

        ArrayList<DriverDTO> allDrivers = driverService.getAllDrivers();
        System.out.println("DEBUG GetAll @1" +allDrivers);

        return new ResponseEntity(new StandardResponse("200","Done",allDrivers),  HttpStatus.CREATED);


    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchDriver(@PathVariable String id){
//        System.out.println(+id);
        DriverDTO driverDTO = driverService.searchDriver(id);
        System.out.println("DEBUG DRIVER @1"+driverDTO);
        return new ResponseEntity(new StandardResponse("200","Done",driverDTO), HttpStatus.OK);

    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteDriver(@RequestParam String id){

        driverService.deleteDriver(id);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }

    @PutMapping
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto){
        if (dto.getDriver_NIC().trim().length()<=0){
            throw new NotFoundException("No ID Provider Update");
        }

        driverService.updateDriver(dto);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }
}
