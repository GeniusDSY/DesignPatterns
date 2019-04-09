package behavioral_patterns.state_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:29
 * @desc :
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }

}
