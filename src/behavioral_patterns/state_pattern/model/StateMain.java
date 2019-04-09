package behavioral_patterns.state_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:29
 * @desc :
 */
public class StateMain {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
    }

}
