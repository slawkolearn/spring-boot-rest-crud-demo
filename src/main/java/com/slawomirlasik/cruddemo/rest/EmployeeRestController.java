package com.slawomirlasik.cruddemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    // quick and dirty: inject employee dao

    // expose "/employees"  endpoint to return all employees
}
