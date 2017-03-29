package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

/**
 * Created by raiko on 29/03/2017.
 */

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public Collection<Employee> findAll() {
        Collection<Employee> employees = employeeRepository.findAll();

        return employees;
    }

}

