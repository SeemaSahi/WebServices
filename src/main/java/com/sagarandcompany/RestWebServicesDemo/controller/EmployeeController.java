package com.sagarandcompany.RestWebServicesDemo.controller;

import com.sagarandcompany.RestWebServicesDemo.domain.Employee;
import com.sagarandcompany.RestWebServicesDemo.util.ResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO save(@RequestBody Employee employee) {
        System.out.println(employee.toString());
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Employee is saved succesfully");
        return responseDTO;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseDTO get(@PathVariable Long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("sagar");
        employee.setSalary(123);
        employee.setEmail("mnp@gmail.com");
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setData(employee);
        responseDTO.setStatus(true);
        return responseDTO;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseDTO delete(@PathVariable Long id) {
        System.out.println("deleted id" + id);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Record is deleted successfully");
        return responseDTO;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO update(@RequestBody Employee employee) {
        System.out.println(employee.toString());
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Employee is update succesfully");
        return responseDTO;
    }

}
