package creational_patterns.factory_method_pattern.calculator.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:25
 * @desc : 乘法产品
 */
public class OperationMulProduction extends OperationProduction {

    @Override
    public double getResult(){
        return getNumberA() * getNumberB();
    }

}
