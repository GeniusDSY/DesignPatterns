package behavioral_patterns.mediatorpattern.colleague;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 17:38
 * @desc : 中介类
 */
public abstract class Mediator {

    public abstract void send(String message,Colleague colleague);

}
