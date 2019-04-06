package behavioral_patterns.observer_pattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:53
 * @desc :
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void announce(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
