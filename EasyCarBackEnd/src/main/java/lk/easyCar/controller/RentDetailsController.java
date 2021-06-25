package lk.easyCar.controller;

import lk.easyCar.dto.RentDTO;
import lk.easyCar.dto.RentDetailsDTO;
import lk.easyCar.service.RentDetailsService;
import lk.easyCar.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentDetails")
@CrossOrigin
public class RentDetailsController {

    @Autowired
    private RentDetailsService rentDetailsService;

    @GetMapping(path = "/{id}")
    public ResponseEntity searchRents(@PathVariable String id){

        RentDetailsDTO rentDetailsDTO = rentDetailsService.searchRentDet(id);

        return new ResponseEntity(new StandardResponse("200","Done",rentDetailsDTO), HttpStatus.OK);


    }
    @GetMapping(path = "/lastID/rentDID")
    public ResponseEntity getLastRid() {
        String lastRid = rentDetailsService.getLastRid();
        return new ResponseEntity(new StandardResponse("200", "Done", lastRid), HttpStatus.CREATED);
    }


}
