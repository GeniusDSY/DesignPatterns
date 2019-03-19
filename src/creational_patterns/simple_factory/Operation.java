package creational_patterns.simple_factory;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 17:46
 * @desc : 运算类（基类）
 */
public class Operation {

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
