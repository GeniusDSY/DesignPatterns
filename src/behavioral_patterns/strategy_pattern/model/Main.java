package behavioral_patterns.strategy_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/10 21:59
 * @desc :
 */
public class Main {

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }

}
