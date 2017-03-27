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

    @RequestMapping("/calculate")
    public int calculatedValue (@RequestParam int num1, int num2, String op) {
        int value = 0;
        if (op.equalsIgnoreCase("sum")){
            value = num1 + num2;
        } else if (op.equalsIgnoreCase("sub")){
            value = num1 - num2;
        } else if (op.equalsIgnoreCase("prod")){
            value = num1 * num2;
        } else if (op.equalsIgnoreCase("div")){
            value = num1 / num2;
        }
        return value;

      //  return Calculate.calculateValue(num1, num2, op);
    }



}
