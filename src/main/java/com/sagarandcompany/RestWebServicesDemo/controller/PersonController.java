package com.sagarandcompany.RestWebServicesDemo.controller;

import com.sagarandcompany.RestWebServicesDemo.domain.Person;
import com.sagarandcompany.RestWebServicesDemo.util.ResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {
    @RequestMapping(value = "/get/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public Person get(@PathVariable Long id) {
        Person person = new Person();
        person.setId(id);
        person.setEmail("abc");
        person.setName("mmmmmm");
        person.setSalary(777);
        return person;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Person save(@RequestBody Person person) {
        System.out.println("TEsting some data");
        System.out.println(person.toString());
        return person;
    }

    @RequestMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.DELETE)


    public boolean delete(@PathVariable Long id)

    {
        return true;
    }
}


