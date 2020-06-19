package com.slawomirlasik.cruddemo.dao;

import com.slawomirlasik.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

}
