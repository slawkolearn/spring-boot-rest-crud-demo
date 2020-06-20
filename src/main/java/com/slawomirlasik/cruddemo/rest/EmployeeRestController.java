package com.slawomirlasik.cruddemo.rest;

import com.slawomirlasik.cruddemo.dao.EmployeeDAO;
import com.slawomirlasik.cruddemo.entity.Employee;
import com.slawomirlasik.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }


    // expose "/employees"  endpoint to return all employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


    // add mapping for GET /employee/{employeeId}

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);

        if( (theEmployee == null)) {
            throw new RuntimeException("Employee id not found " + employeeId);

        }

        return theEmployee;

    }

}
