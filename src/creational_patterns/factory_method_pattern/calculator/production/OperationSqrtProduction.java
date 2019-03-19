package creational_patterns.factory_method_pattern.calculator.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:40
 * @desc :
 */
public class OperationSqrtProduction extends OperationProduction {

    @Override
    public double getResult(){
        return Math.sqrt(getNumberA()*getNumberA() + getNumberB() * getNumberB());
    }

}
