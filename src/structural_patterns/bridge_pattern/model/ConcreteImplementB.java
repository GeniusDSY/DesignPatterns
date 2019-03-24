package structural_patterns.bridge_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:27
 * @desc : 具体实现B
 */
public class ConcreteImplementB extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }

}
