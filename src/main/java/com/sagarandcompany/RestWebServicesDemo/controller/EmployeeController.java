package com.sagarandcompany.RestWebServicesDemo.controller;

import com.sagarandcompany.RestWebServicesDemo.domain.Employee;
import com.sagarandcompany.RestWebServicesDemo.service.EmployeeService;
import com.sagarandcompany.RestWebServicesDemo.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseDTO get(@PathVariable Long id) {
        return employeeService.get(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseDTO delete(@PathVariable Long id) {
        System.out.println("deleted id" + id);
        return employeeService.delete(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO update(@RequestBody Employee employee) {
        System.out.println(employee.toString());
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Employee is update succesfully");
        return employeeService.update(employee);
    }

}
