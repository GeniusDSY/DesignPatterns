package structural_patterns.decorator_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:21
 * @desc :
 */
public class ConcreteComponent extends  Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
