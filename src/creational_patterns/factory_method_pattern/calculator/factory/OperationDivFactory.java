package creational_patterns.factory_method_pattern.calculator.factory;

import creational_patterns.factory_method_pattern.calculator.production.OperationDivProduction;
import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:21
 * @desc : 除法工厂
 */
public class OperationDivFactory implements OperationFactory {
    @Override
    public OperationProduction createOperation() {
        return new OperationDivProduction();
    }
}
