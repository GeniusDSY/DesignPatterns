package creational_patterns.singleton_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/22 21:52
 * @desc : 饿汉式多线程
 */
public class DoubleLockedHunger {

    private static DoubleLockedHunger instance = null;

    private DoubleLockedHunger(){

    }

    public static DoubleLockedHunger getInstance(){
        return instance;
    }

    /*
     * 缺点：没有lazy loading的效果，从而降低内存的使用率
     * */

}
