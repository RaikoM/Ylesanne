package controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by raiko on 27/03/2017.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
