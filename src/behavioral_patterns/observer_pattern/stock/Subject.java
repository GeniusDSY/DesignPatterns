package behavioral_patterns.observer_pattern.stock;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:22
 * @desc : 通知者接口
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void announce();

    String getAction();
    void setAction(String action);

}
