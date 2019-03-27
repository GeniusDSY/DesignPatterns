package structural_patterns.flyweightpattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:15
 * @desc : 实现FlyWeight，为内部状态增加存储空间
 */
public class ConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体FlyWeight:" + extrinsicstate);
    }
}
