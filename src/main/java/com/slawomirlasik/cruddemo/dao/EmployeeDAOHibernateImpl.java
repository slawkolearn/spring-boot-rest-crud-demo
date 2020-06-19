package com.slawomirlasik.cruddemo.dao;

import com.slawomirlasik.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
