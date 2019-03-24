package structural_patterns.bridge_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:44
 * @desc :
 */
public class Model_Main {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementB());
        abstraction.operation();
    }

}
