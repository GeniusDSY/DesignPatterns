package creational_patterns.factory_method_pattern.calculator.factory;

import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;
import creational_patterns.factory_method_pattern.calculator.production.OperationSqrtProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:39
 * @desc :
 */
public class OperationSqrtFactory implements OperationFactory {
    @Override
    public OperationProduction createOperation() {
        return new OperationSqrtProduction();
    }
}
