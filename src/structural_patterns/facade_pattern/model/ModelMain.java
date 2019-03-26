package structural_patterns.facade_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/26 16:48
 * @desc :
 */
public class ModelMain {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
