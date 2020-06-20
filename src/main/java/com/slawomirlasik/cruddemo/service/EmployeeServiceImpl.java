package com.slawomirlasik.cruddemo.service;

import com.slawomirlasik.cruddemo.dao.EmployeeDAO;
import com.slawomirlasik.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }



    @Override
    @Transactional
    public List<Employee> findAll() {
        return null;
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {

    }

    @Override
    @Transactional
    public void deleteById(int id) {

    }
}
