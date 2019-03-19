package creational_patterns.simple_factory;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 20:22
 * @desc :
 */
public class Mul extends Operation {

    @Override
    public double getResult(){

        return getNumberA() * getNumberB();

    }

}
