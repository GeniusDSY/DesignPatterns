package behavioral_patterns.state_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:31
 * @desc :
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }

}
