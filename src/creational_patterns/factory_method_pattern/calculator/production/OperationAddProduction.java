package creational_patterns.factory_method_pattern.calculator.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:24
 * @desc : 加法产品（结果生成）
 */
public class OperationAddProduction extends OperationProduction {

    @Override
    public double getResult(){
        return getNumberA() + getNumberB();
    }

}
