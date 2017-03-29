package datamodel;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by raiko on 28/03/2017.
 */
@Component
public class EmployeeToEmployeesForm implements Converter<Employee, EmployeeForm> {

    @Override
    public EmployeeForm convert(Employee employee){
        EmployeeForm employeeForm = new EmployeeForm();
        employeeForm.setId(employee.getId());
        employeeForm.setEmployee_name(employee.getEmployee_name());
        employeeForm.setSupervisor_name(employee.getSupervisor_name());
        employeeForm.setSupervisorId(employee.getSupervisorId());
        return employeeForm;

    }
}