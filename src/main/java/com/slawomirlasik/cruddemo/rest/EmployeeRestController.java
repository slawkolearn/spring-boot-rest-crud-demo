package com.slawomirlasik.cruddemo.rest;

import com.slawomirlasik.cruddemo.dao.EmployeeDAO;
import com.slawomirlasik.cruddemo.entity.Employee;
import com.slawomirlasik.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    // add mapping for POST /employees - add new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody // Binding JSON to employee object
                                            Employee theEmployee){

        // also just in case they pass an id in JSON .. set id to 0
        // this is to force a save of new item .. instead of update
        theEmployee.setId(0);

        employeeService.save(theEmployee);

        return theEmployee;
    }

}
