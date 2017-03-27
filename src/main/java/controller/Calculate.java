package controller;

/**
 * Created by raiko on 27/03/2017.
 */
public class Calculate {

    private final String op;
    private final int num1;
    private final int num2;

    public Calculate(int num1, int num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }


    public String getOp() {
        return op;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
}
