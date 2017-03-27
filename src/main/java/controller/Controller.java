package controller;

import org.springframework.web.bind.annotation.*;


/**
 * Created by raiko on 27/03/2017.
 */

@RestController
public class Controller {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld (@RequestParam(value="hello", defaultValue = "Hello World!") String hello){
        return hello;
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public double calculatedValue (@RequestParam double num1, double num2, String op) {
       return Calculate.calculateValue(num1, num2, op);
    }



}
