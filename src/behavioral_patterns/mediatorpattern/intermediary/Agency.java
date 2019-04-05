package behavioral_patterns.mediatorpattern.intermediary;

/**
 * @author :DengSiYuan
 * @date :2019/4/5 14:38
 * @desc : 房屋中介
 */
public abstract class Agency {

    //发布公告，中间传话
    public abstract void announce(String message,House house);

}
