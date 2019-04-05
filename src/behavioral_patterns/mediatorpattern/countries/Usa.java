package behavioral_patterns.mediatorpattern.countries;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 18:21
 * @desc :
 */
public class Usa extends Country {

    public Usa(UnitedNations mediator) {
        super(mediator);
    }

    //声明
    public void declare(String message){
        mediator.declare(message,this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println("美国获得对方消息：" + message);
    }

}
