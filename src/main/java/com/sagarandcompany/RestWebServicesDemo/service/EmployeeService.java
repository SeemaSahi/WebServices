package com.sagarandcompany.RestWebServicesDemo.service;

import com.sagarandcompany.RestWebServicesDemo.domain.Employee;
import com.sagarandcompany.RestWebServicesDemo.repository.EmployeRepository;
import com.sagarandcompany.RestWebServicesDemo.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Service
public class EmployeeService {
    @Autowired
    EmployeRepository employeRepository;

    @PersistenceContext
    EntityManager entityManager;

    public Employee save(Employee employee) {
        employeRepository.save(employee);
       /* ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setMessage("Employee is saved succesfully");*/
        return employee;
    }

  /*  public void criteriaQueryDemo() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<Employee> root = criteriaQuery.from(Employee.class);


        criteriaQuery.where(criteriaBuilder.equal(root.get("name").as(String.class), "xyz"));


        Query query = entityManager.createQuery(criteriaQuery);
        Employee employee = (Employee) query.getSingleResult();
        System.out.println(employee.toString());
    }
*/
    //    @Transactional
    public Employee get(Long id) {
//        Employee employee1 = employeRepository.findById(id).get();
//        Employee employee2 = employeRepository.findById(id).get();
//        Employee employee3 = employeRepository.findById(id).get();
//        Employee employee1 = employeRepository.getOne(id);
//        Employee employee2 = employeRepository.getOne(id);
//        Employee employee3 = employeRepository.getOne(id);

       // criteriaQueryDemo();
//        Employee employee1 = entityManager.find(Employee.class, id, LockModeType.PESSIMISTIC_READ);
//        employee1.setEmail("xyz.com");
//        entityManager.merge(employee1);
//        entityManager.flush();
//        employeRepository.save(employee1);
       /* ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setData(employee);
       */
        return new Employee();
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
