package creational_patterns.builder_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/21 17:01
 * @desc : 指挥官，指挥建造产品
 */
public class Director {

    public void construct(AbstractBuilder builder){
        builder.buildProductA();
        builder.buildProductB();
    }

}
