package creational_patterns.simple_factory;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 20:24
 * @desc :
 */
public class Div extends Operation{

    @Override
    public double getResult(){

        return getNumberA() / getNumberB();

    }

}