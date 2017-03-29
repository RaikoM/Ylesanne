package controller;

import calculate.Calculate;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import datamodel.EmployeeToEmployeesForm;
import datamodel.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.StringReader;


/**
 * Created by raiko on 27/03/2017.
 */

@RestController
public class Controller {
    private EmployeeService employeeService;

    public EmployeeToEmployeesForm employeeToEmployeesForm;

    @Autowired
    public void setEmployeeToEmployeesForm(EmployeeToEmployeesForm employeeToEmployeesForm) {
        this.employeeToEmployeesForm = employeeToEmployeesForm;
    }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String helloWorld (@RequestParam(value="hello", defaultValue = "Hello World!") String hello){
        return hello;
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public double calculateGetValue (@RequestParam double num1, @RequestParam double num2, @RequestParam String op) {
       return Calculate.calculateValue(num1, num2, op);
    }

    @RequestMapping(value = "/calculate",  method = RequestMethod.POST)
    @ResponseBody
    public double calculate (@RequestBody String payload){
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new StringReader(payload));
        reader.setLenient(true);
        Calculate calculate = gson.fromJson(payload, Calculate.class);
        return calculate.calculateValue();

        // Used JSON {"num1": 5,"num2": 12.25,"op": "prod"}
    }

    @RequestMapping(value = {"/employees", "/list"}, method = RequestMethod.GET)
    public String listEmployees(Model model){
        model.addAttribute("list", employeeService.listAll());
        return "/list";
    }










}
