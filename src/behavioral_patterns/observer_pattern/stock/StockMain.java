package behavioral_patterns.observer_pattern.stock;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:48
 * @desc :
 */
public class StockMain {

    public static void main(String[] args) {
        Boss dsy = new Boss();

        StockObserver kobe = new StockObserver("kobe",dsy);
        StockObserver curry = new StockObserver("curry",dsy);

        dsy.attach(kobe);
        dsy.attach(curry);

        dsy.setAction("老板回来啦！");

        dsy.announce();
    }

}
