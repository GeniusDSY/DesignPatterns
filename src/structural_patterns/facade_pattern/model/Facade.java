package structural_patterns.facade_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/26 10:01
 * @desc : 外观类
 */
public class Facade {

    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("方法组A()----");
        subSystemOne.methodOne();
        subSystemThree.methodThree();
    }

    public void methodB(){
        System.out.println("方法组B()----");
        subSystemTwo.methodTwo();
    }

}
