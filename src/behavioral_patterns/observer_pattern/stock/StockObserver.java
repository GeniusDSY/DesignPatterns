package behavioral_patterns.observer_pattern.stock;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:43
 * @desc :
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.printf("%s%s关闭股票，继续工作！",subject.getAction(),name);
    }

}
