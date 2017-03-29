package controller;

import calculate.Calculate;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.StringReader;
import java.util.Collection;


/**
 * Created by raiko on 27/03/2017.
 */

@RestController
public class Controller {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        String hello = "Hello World!";
        return hello;
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public double calculateGetValue(@RequestParam double num1, @RequestParam double num2, @RequestParam String op) {
        return Calculate.calculateValue(num1, num2, op);
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    @ResponseBody
    public double calculate(@RequestBody String payload) {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new StringReader(payload));
        reader.setLenient(true);
        Calculate calculate = gson.fromJson(payload, Calculate.class);
        return calculate.calculateValue();

        // Used JSON {"num1": 5,"num2": 12.25,"op": "prod"}
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ResponseEntity<Collection<Employee>> getEmployees() {
        Collection<Employee> employees = employeeService.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


}
