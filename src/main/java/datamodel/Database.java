package datamodel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by raiko on 27/03/2017.
 */
public class Database {

    public static final String TABLE_EMPLOYEES = "employees";
    public static final String COLUMN_EMPLOYEES_ID = "_id";
    public static final String COLUMN_EMPLOYEES_NAME = "name";
    public static final String COLUMN_EMPLOYEES_SUPERVISOR = "supervisor";

    public static final String TABLE_SUPERVISOR = "supervisor";
    public static final String COLUMN_SUPERVISOR_ID = "_id";
    public static final String COLUMN_SUPERVISOR_NAME = "name";


    public static final String QUERY_EMPLOYEES_TABLE = "SELECT " + TABLE_EMPLOYEES + "." + COLUMN_EMPLOYEES_NAME + ", " + TABLE_SUPERVISOR + "." +
            COLUMN_SUPERVISOR_NAME + " FROM " + TABLE_EMPLOYEES + " INNER JOIN " + TABLE_SUPERVISOR + " ON " + TABLE_EMPLOYEES + "." +
            COLUMN_EMPLOYEES_SUPERVISOR + " = " + TABLE_SUPERVISOR + "." + COLUMN_SUPERVISOR_ID + " ORDER BY " + TABLE_EMPLOYEES + "." + COLUMN_EMPLOYEES_NAME;

    private static Connection connection;
    private static String OS;

    public boolean open() {
        try {
            if (isWindows()){
                connection = DriverManager.getConnection("jdbc:sqlite:\\Ylesanne\\ylesanne.db");
            } else {
                connection = DriverManager.getConnection("jdbc:sqlite:/Ylesanne/ylesanne.db");
            }
            return true;
        } catch (SQLException e){
            System.out.println("Failed to connect: " + e.getMessage());
            return false;
        }
    }

    public static  List<Employee> queryEmployees() {
        StringBuilder sb = new StringBuilder(QUERY_EMPLOYEES_TABLE);

        try (Statement statement = connection.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {
            List<Employee> employees = new ArrayList<>();
            while (results.next()) {
                Employee employee = new Employee();
                employee.setName(results.getString(2));
                employee.setSupervisorId(3);
                employees.add(employee);
            }
            return employees;

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            return null;
        }
    }

    private String getOsName() {
        if (OS == null){
            System.getProperty("os.name");
        }
        return OS;
    }

    private boolean isWindows(){
        return getOsName().startsWith("Windows");
    }
    private boolean isUnix(){
        return getOsName().startsWith("Mac");
    }
}
