package creational_patterns.singleton_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/22 21:08
 * @desc : 多线程环境，懒汉式（不好）
 */
public class Multithreading {

    //共享静态实例对象
    private static Multithreading instance = null;

    //私有构造方法
    private Multithreading(){

    }

    //加锁，多线程情况下，可以让该方法只让一个线程访问
    public static synchronized Multithreading getInstance(){
        if(instance == null){
            instance = new Multithreading();
        }
        return instance;
    }

    /*
     * 缺点：每次通过getInstance方法得到singleton实例的时候都有一个试图去获取同步锁的过程。
     * 而众所周知，加锁是很耗时的。能避免则避免。
     * */

}
