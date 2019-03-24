package structural_patterns.bridge_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:27
 * @desc : 具体实现A
 */
public class ConcreteImplementA extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }

}
