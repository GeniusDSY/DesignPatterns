package creational_patterns.simple_factory_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 17:45
 * @desc :
 */
public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+" :
                operation = new Add();
                break;
            case "-" :
                operation = new Sub();
                break;
            case "*" :
                operation = new Mul();
                break;
            case "/" :
                operation = new Div();
                break;
        }
        return operation;
    }

}
