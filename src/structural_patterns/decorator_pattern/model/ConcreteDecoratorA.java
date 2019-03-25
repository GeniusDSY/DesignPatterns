package structural_patterns.decorator_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:28
 * @desc :
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation(){
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作" + addedState);
    }

}
