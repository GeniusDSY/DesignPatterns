package structural_patterns.decorator_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:23
 * @desc :
 */
public abstract class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
