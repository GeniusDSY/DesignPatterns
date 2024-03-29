package creational_patterns.singleton_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/22 22:00
 * @desc : 静态内部类
 */
public class StaticSingleThread {

    private StaticSingleThread(){

    }

    private static class SingletonHolder{
        private final static StaticSingleThread instance = new StaticSingleThread();
    }

    public static StaticSingleThread getInstance(){
        return SingletonHolder.instance;
    }

    /*
     * 注解：定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。而类型为SingletonHolder的类，
     * 只有在Singleton.getInstance()中调用，由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。
     * 优点：达到了lazy loading的效果，即按需创建实例。
     */

}
