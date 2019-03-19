package creational_patterns.simple_factory;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 20:26
 * @desc :
 */
public class Simple_Factory_Main {

    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.createOperate("+");
        operation.setNumberA(5);
        operation.setNumberB(6);
        double resultAdd = operation.getResult();
        System.out.println("加法结果为" + resultAdd);
        operation = OperationFactory.createOperate("-");
        operation.setNumberA(5);
        operation.setNumberB(6);
        double resultSub = operation.getResult();
        System.out.println("减法结果为" + resultSub);
        operation = OperationFactory.createOperate("*");
        operation.setNumberA(5);
        operation.setNumberB(6);
        double resultMul = operation.getResult();
        System.out.println("乘法结果为" + resultMul);
        operation = OperationFactory.createOperate("/");
        operation.setNumberA(5);
        operation.setNumberB(6);
        double resultDiv = operation.getResult();
        System.out.println("加法结果为" + resultDiv);
    }

}
