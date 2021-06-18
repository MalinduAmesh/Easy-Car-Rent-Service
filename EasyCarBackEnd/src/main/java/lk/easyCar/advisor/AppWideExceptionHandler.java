package lk.easyCar.advisor;

import lk.easyCar.exception.NotFoundException;
import lk.easyCar.exception.ValidationException;
import lk.easyCar.utill.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServlet;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException(Exception e){
        return new ResponseEntity(new StandardResponse("500","Error",e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handlerNotFoundException(NotFoundException e){
        return new ResponseEntity(new StandardResponse("404","Error",e.getMessage()),  HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity handlerNotFoundException(ValidationException e){
        return new ResponseEntity(new StandardResponse("400","Error",e.getMessage()),  HttpStatus.BAD_REQUEST);
    }
}
