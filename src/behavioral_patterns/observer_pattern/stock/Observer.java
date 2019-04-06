package behavioral_patterns.observer_pattern.stock;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:22
 * @desc :
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
