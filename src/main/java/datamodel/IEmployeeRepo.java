package datamodel;

import datamodel.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raiko on 27/03/2017.
 */
public interface IEmployeeRepo extends CrudRepository<Employee, Long> {
}
