package behavioral_patterns.strategy_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/10 21:55
 * @desc :
 */
public class ConcreteStrategyA extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }

}
