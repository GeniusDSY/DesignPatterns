package behavioral_patterns.mediatorpattern.colleague;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 17:44
 * @desc :
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事1得到信息："+message);
    }

}
