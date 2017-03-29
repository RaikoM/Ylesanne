package datamodel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raiko on 28/03/2017.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private IEmployeeRepo iEmployeeRepo;
    private EmployeesFormToEmployee employeesFormToEmployee;

    @Autowired
    public EmployeeServiceImpl(IEmployeeRepo iEmployeeRepo, EmployeesFormToEmployee employeesFormToEmployee){
        this.iEmployeeRepo = iEmployeeRepo;
        this.employeesFormToEmployee = employeesFormToEmployee;
    }

    @Override
    public List<Employee> listAll() {
        List<Employee> employees = new ArrayList<>();
        iEmployeeRepo.findAll().forEach(employees::add);
        return employees;
    }
}