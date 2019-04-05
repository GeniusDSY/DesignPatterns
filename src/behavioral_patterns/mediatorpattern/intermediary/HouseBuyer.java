package behavioral_patterns.mediatorpattern.intermediary;

/**
 * @author :DengSiYuan
 * @date :2019/4/5 14:40
 * @desc : 房屋购买者
 */
public class HouseBuyer extends House {

    public HouseBuyer(Agency agency) {
        super(agency);
    }

    public void announce(String message){
        agency.announce(message,this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println("买房者得到消息：" + message);
    }

}
