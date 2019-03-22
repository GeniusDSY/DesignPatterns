package creational_patterns.singleton_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/22 21:24
 * @desc : 双重锁定（可行）
 */
public class DoubleLocked {

    private static DoubleLocked instance = null;

    private DoubleLocked(){

    }

    /**
     * 先进行一次if判断，若不存在，在对多进程进行加锁操作，然后再进行一次if判断，
     * 防止其他线程已经创建完毕，减少了懒汉式中，不加判断就加锁的开销。
     * */
    public static DoubleLocked getInstance(){
        if (instance == null){
            synchronized (DoubleLocked.class){
                if (instance == null){
                    instance = new DoubleLocked();
                }
            }
        }
        return instance;
    }

    /*
     * 缺点：使用双重if，复杂，容易出错
     * */

}
