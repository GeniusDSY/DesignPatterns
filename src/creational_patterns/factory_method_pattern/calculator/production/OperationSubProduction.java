package creational_patterns.factory_method_pattern.calculator.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:25
 * @desc : 减法产品
 */
public class OperationSubProduction extends OperationProduction {

    @Override
    public double getResult(){
        return getNumberA() - getNumberB();
    }

}
