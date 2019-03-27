package structural_patterns.flyweightpattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:16
 * @desc : 不共享的FlyWeight子类
 */
public class UnsharedConcreteFlyWeight extends FlyWeight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体FlyWeight：" + extrinsicstate);
    }

}
