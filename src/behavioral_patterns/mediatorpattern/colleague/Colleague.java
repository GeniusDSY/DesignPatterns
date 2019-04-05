package behavioral_patterns.mediatorpattern.colleague;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 17:39
 * @desc : 同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
