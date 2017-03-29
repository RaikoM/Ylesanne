package datamodel;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;



@Component
public class EmployeesFormToEmployee implements Converter<EmployeeForm, Employee> {

    @Override
    public Employee convert(EmployeeForm employeeForm){
        Employee employee = new Employee();
        if (employeeForm.getId() != null && !StringUtils.isEmpty(employeeForm.getId())) {
            employee.setId(new Long((employeeForm.getId())));
        }
        employee.setEmployee_name(employeeForm.getEmployee_name());
        employee.setSupervisor_name(employeeForm.getSupervisor_name());
        employee.setSupervisorId(employeeForm.getSupervisorId());
        return employee;
    }
}