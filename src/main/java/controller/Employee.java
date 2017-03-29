package controller;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by raiko on 27/03/2017.
 */
@Entity
public class Employee implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private String employee;

    private String supervisor;

    private int supervisorId;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }
}
