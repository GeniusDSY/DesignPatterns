package behavioral_patterns.observer_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 15:01
 * @desc :
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.printf("观察者%s的新状态是%s\n",name,observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
