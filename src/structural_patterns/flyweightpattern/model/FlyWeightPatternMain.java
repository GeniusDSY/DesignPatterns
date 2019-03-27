package structural_patterns.flyweightpattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:25
 * @desc :
 */
public class FlyWeightPatternMain {

    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight fx = factory.getFlyWeight("X");
        fx.operation(--extrinsicstate);

        FlyWeight fy = factory.getFlyWeight("Y");
        fy.operation(--extrinsicstate);

        FlyWeight fz = factory.getFlyWeight("Z");
        fz.operation(--extrinsicstate);

        FlyWeight uf = new UnsharedConcreteFlyWeight();
        uf.operation(--extrinsicstate);

    }

}
