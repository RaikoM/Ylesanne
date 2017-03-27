package controller;

/**
 * Created by raiko on 27/03/2017.
 */
public class Calculate {

//    private final String op;
//    private final int num1;
//    private final int num2;
//
//    public Calculate(int num1, int num2, String op) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.op = op;
//        calculateValue(num1, num2, op);
//    }

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
