package structural_patterns.decorator_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:30
 * @desc :
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){
        System.out.println("B独有的方法");
    }

}
