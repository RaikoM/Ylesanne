package calculate;


/**
 * Created by raiko on 27/03/2017.
 */
public class Calculate {

    private double num1;
    private double num2;
    public String op;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public double calculateValue(){
        double value = 0.0;
        if (this.op.equalsIgnoreCase("sum")){
            value = this.getNum1() + this.getNum2();
        } else if (this.op.equalsIgnoreCase("sub")){
            value = this.getNum1() - this.getNum2();
        } else if (this.op.equalsIgnoreCase("prod")){
            value = this.getNum1() * this.getNum2();
        } else if (this.op.equalsIgnoreCase("div")){
            value = this.getNum1() / this.getNum2();
        }
        return value;
    }


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
