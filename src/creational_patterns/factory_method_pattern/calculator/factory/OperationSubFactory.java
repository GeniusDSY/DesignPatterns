package creational_patterns.factory_method_pattern.calculator.factory;

import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;
import creational_patterns.factory_method_pattern.calculator.production.OperationSubProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:20
 * @desc : 减法工厂
 */
public class OperationSubFactory implements OperationFactory{
    @Override
    public OperationProduction createOperation() {
        return new OperationSubProduction();
    }
}
