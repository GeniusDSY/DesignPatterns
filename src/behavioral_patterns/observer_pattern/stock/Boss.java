package behavioral_patterns.observer_pattern.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:25
 * @desc :
 */
public class Boss implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void announce() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getAction(){
        return action;
    }

    @Override
    public void setAction(String action){
        this.action = action;
    }

}
