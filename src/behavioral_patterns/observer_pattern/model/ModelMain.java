package behavioral_patterns.observer_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 15:03
 * @desc :
 */
public class ModelMain {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("X", (ConcreteSubject) subject));
        subject.attach(new ConcreteObserver("Y", (ConcreteSubject) subject));
        subject.attach(new ConcreteObserver("Z", (ConcreteSubject) subject));

        ((ConcreteSubject) subject).setSubjectState("ABC");
        subject.announce();
    }

}
