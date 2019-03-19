package creational_patterns.factory_method_pattern.calculator.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:22
 * @desc :
 */
public class OperationProduction {

    private double numberA;
    private double numberB;


    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getResult(){
        double result = 0;
        return result;
    }

}
