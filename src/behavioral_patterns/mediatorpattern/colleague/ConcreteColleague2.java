package behavioral_patterns.mediatorpattern.colleague;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 17:47
 * @desc :
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事2得到信息："+message);
    }

}
