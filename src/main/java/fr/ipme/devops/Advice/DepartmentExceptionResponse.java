package fr.ipme.devops.Advice;

import fr.ipme.devops.RunTime_Exception.DepartmentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DepartmentExceptionResponse {

    @ResponseBody
    @ExceptionHandler(DepartmentNotFoundException.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    String departmentNotFoundHandler(DepartmentNotFoundException departmentNotFoundHandler) {
        return HttpStatus.ACCEPTED + " : " + departmentNotFoundHandler.getMessage();
    }

}
