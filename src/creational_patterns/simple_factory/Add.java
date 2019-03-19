package creational_patterns.simple_factory;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 17:48
 * @desc :
 */
public class Add extends Operation {

    @Override
    public double getResult() {

        return getNumberA() + getNumberB();

    }

}
