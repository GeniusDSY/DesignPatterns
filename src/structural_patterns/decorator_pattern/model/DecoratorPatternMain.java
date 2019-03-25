package structural_patterns.decorator_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:31
 * @desc :
 */
public class DecoratorPatternMain {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();

    }

}
