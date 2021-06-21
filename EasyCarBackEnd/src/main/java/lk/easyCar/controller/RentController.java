package lk.easyCar.controller;

import lk.easyCar.dto.RentDTO;
import lk.easyCar.dto.VehicleDTO;
import lk.easyCar.entity.Rent;
import lk.easyCar.exception.NotFoundException;
import lk.easyCar.service.RentService;
import lk.easyCar.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rent")
@CrossOrigin
public class RentController {

    @Autowired
    private RentService rentService;


    @PostMapping
    public ResponseEntity saveRent(@RequestBody RentDTO rentDTO){
        if (rentDTO.getRentID().trim().length()<=0){
            throw new NotFoundException("Rent id Cannot to be null");

        }
        System.out.println("Save the Rent ");
        rentService.addRent(rentDTO);

        return new ResponseEntity(new StandardResponse("201","Done",rentDTO), HttpStatus.CREATED);

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity allRents(){

//    return rentService.getAllRents();

        ArrayList<RentDTO> allRents = rentService.getAllRents();
        return new ResponseEntity(new StandardResponse("200","Done",allRents),  HttpStatus.CREATED);

    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteRent (@RequestParam String id){

        rentService.deleteRent(id);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchRents(@PathVariable String id){

       RentDTO rentDTO =  rentService.searchRent(id);
        return new ResponseEntity(new StandardResponse("200","Done",rentDTO), HttpStatus.OK);


    }

    @PutMapping
    public ResponseEntity updateRent(@RequestBody RentDTO rentDTO){
        if (rentDTO.getRentID().trim().length()<=0){
            throw new NotFoundException("No ID Provider Update");
        }
        rentService.updateRent(rentDTO);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }

    @GetMapping(path = "/lastID/rentID")
    public ResponseEntity getLastRid() {
        String lastRid = rentService.getLastRid();
        return new ResponseEntity(new StandardResponse("200", "Done", lastRid), HttpStatus.CREATED);
    }
}
