package creational_patterns.factory_method_pattern.calculator.factory;

import creational_patterns.factory_method_pattern.calculator.production.OperationMulProduction;
import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:21
 * @desc :乘法工厂
 */
public class OperationMulFactory implements OperationFactory {
    @Override
    public OperationProduction createOperation() {
        return new OperationMulProduction();
    }
}
