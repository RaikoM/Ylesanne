package controller;


/**
 * Created by raiko on 27/03/2017.
 */
public class Calculate {

    public static double calculateValue (double num1, double num2, String op){
        double value = 0.0;
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
    }



}
