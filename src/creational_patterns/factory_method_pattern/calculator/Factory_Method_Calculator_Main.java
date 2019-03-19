package creational_patterns.factory_method_pattern.calculator;

import creational_patterns.factory_method_pattern.calculator.factory.*;
import creational_patterns.factory_method_pattern.calculator.production.OperationProduction;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:29
 * @desc : 计算器启动
 */
public class Factory_Method_Calculator_Main {

    public static void main(String[] args) {
        OperationFactory operationAddFactory = new OperationAddFactory();
        OperationProduction addProduction = operationAddFactory.createOperation();
        addProduction.setNumberA(10);
        addProduction.setNumberB(5);
        System.out.println("加法结果：" + addProduction.getResult());
        OperationFactory operationMulFactory = new OperationMulFactory();
        OperationProduction mulProduction = operationMulFactory.createOperation();
        mulProduction.setNumberA(10);
        mulProduction.setNumberB(5);
        System.out.println("乘法结果：" + mulProduction.getResult());
        OperationFactory operationSubFactory = new OperationSubFactory();
        OperationProduction subProduction = operationSubFactory.createOperation();
        subProduction.setNumberA(10);
        subProduction.setNumberB(5);
        System.out.println("减法结果：" + subProduction.getResult());
        OperationFactory operationDivFactory = new OperationDivFactory();
        OperationProduction divProduction = operationDivFactory.createOperation();
        divProduction.setNumberA(10);
        divProduction.setNumberB(5);
        System.out.println("除法结果：" + divProduction.getResult());

        System.out.println("新加一个平方根");
        OperationFactory operationSqrtFactory = new OperationSqrtFactory();
        OperationProduction sqrtProduction = operationSqrtFactory.createOperation();
        sqrtProduction.setNumberA(10);
        sqrtProduction.setNumberB(5);
        System.out.println("平方根结果：" + sqrtProduction.getResult());
    }


}
