package behavioral_patterns.mediatorpattern.intermediary;

/**
 * @author :DengSiYuan
 * @date :2019/4/5 14:40
 * @desc : 房屋出售者
 */
public class HouseHost extends House {

    public HouseHost(Agency agency) {
        super(agency);
    }

    public void announce(String message){
        agency.announce(message,this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println("卖房者发布信息：" + message);
    }

}
