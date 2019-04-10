package behavioral_patterns.strategy_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/10 21:56
 * @desc :上下文，用一个ConcreteStrategy来配置，维护一个对Strategy的引用
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
