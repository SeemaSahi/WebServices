package com.sagarandcompany.RestWebServicesDemo.service;

import com.sagarandcompany.RestWebServicesDemo.domain.Employee;
import com.sagarandcompany.RestWebServicesDemo.repository.EmployeRepository;
import com.sagarandcompany.RestWebServicesDemo.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeRepository employeRepository;

    public ResponseDTO save(Employee employee) {
        employeRepository.save(employee);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Employee is saved succesfully");
        return responseDTO;
    }

    public ResponseDTO get(Long id) {
        Employee employee = employeRepository.findById(id).get();
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setData(employee);
        return responseDTO;
    }

        public ResponseDTO delete(Long id) {
            employeRepository.deleteById(id);
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setStatus(true);
            responseDTO.setMessage("deleted record");
            return responseDTO;

        }
    public ResponseDTO update(Employee employee) {
        employeRepository.save(employee);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Employee is saved succesfully");
        return responseDTO;
    }

}
