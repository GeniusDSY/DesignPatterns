package creational_patterns.factory_method_pattern.calculator.factory;

import creational_patterns.factory_method_pattern.calculator.production.OperationAddProduction;
import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:19
 * @desc : 加法工厂
 */
public class OperationAddFactory implements OperationFactory {
    @Override
    public OperationProduction createOperation() {
        return new OperationAddProduction();
    }
}
