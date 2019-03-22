package creational_patterns.singleton_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/22 17:51
 * @desc : 单线程环境下（不好）
 */
public class SingleThread {

    ////共享静态私有实例
    private static SingleThread instance = null;

    //构造函数私有
    private SingleThread(){

    }

    public static SingleThread getInstance(){
        //当判断改实例对象不存在时，在创建一个新的实例对象
        if(instance == null){
            instance = new SingleThread();
        }
        return instance;
    }
    /*
     *  缺点：只有在单线程情况下才会正常运行，在多线程情况下，会出现多个线程同时
     *       进行到if语句，此时判断均为null，则都会创建新的对象实例，即多个实例对象出现
     */
}
