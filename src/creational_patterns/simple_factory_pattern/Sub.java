package creational_patterns.simple_factory_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 20:21
 * @desc :
 */
public class Sub extends Operation{

    @Override
    public double getResult(){

        return getNumberA() - getNumberB();

    }

}
