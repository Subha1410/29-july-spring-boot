package com.te.ems.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(path = "api/employee")
@RestController
public class EmployeeController() {


    @GetMapping(path = "dummy")
    public String dummyResponse(){
        return "My brain is not working";

    }

}
