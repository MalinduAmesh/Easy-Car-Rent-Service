package lk.easyCar.controller;

import lk.easyCar.dto.UserDTO;
import lk.easyCar.exception.NotFoundException;
import lk.easyCar.service.CustomerService;
import lk.easyCar.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody UserDTO userDTO){

        if (userDTO.getCusNicID().trim().length()<=0){
            throw new NotFoundException("Customer id Cannot to be null");
        }

        customerService.addCustomer(userDTO);

        return new ResponseEntity(new StandardResponse("201","Done",userDTO),HttpStatus.CREATED);


    }

    @GetMapping
    public ResponseEntity allCustomers(){

        ArrayList<UserDTO> aLlCustomers = customerService.getALlCustomers();

        return new ResponseEntity(new StandardResponse("200","Done",aLlCustomers),  HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCustomer(@PathVariable String id){

        UserDTO userDTO = customerService.searchCustomer(id);

        return new ResponseEntity(new StandardResponse("200","Done",userDTO), HttpStatus.OK);

    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);

        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);


    }

    @PutMapping
    public  ResponseEntity updateDriver(@RequestBody UserDTO userDTO){
        if (userDTO.getCusNicID().trim().length()<=0){
            throw new NotFoundException("NO ID Provider Update");
        }

        customerService.updateCustomer(userDTO);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.NO_CONTENT);

    }

    @GetMapping(path = "/lastID/customer")
    public ResponseEntity getLastRid() {
        String lastRid = customerService.getLastRid();
        return new ResponseEntity(new StandardResponse("200", "Done", lastRid), HttpStatus.CREATED);
    }

    @PostMapping(path = "/uplodedImg",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadPhotos(@RequestPart("image")MultipartFile multipartFile){

        try{
            String fileName = multipartFile.getOriginalFilename();

            InputStream inputStream = multipartFile.getInputStream();
            Path path = Paths.get("/Users/amesh/IdeaProjects/CarPhotos/");

            if (!Files.exists(path)){
                Files.createDirectories(path);

            }
            Files.copy(inputStream,path.resolve(fileName));
            return new ResponseEntity(new StandardResponse("200", "Image Uploaded", null), HttpStatus.CREATED);


        }catch (IOException e){
            e.printStackTrace();
            return new ResponseEntity(new StandardResponse("200", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
