package creational_patterns.factory_method_pattern.calculator.factory;

import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:18
 * @desc :这是抽象工厂接口
 */
public interface OperationFactory {

    OperationProduction createOperation();
}
