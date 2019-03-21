package creational_patterns.builder_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/21 17:03
 * @desc :
 */
public class Builder_Pattern_Main {

    public static void main(String[] args) {

        Director director = new Director();
        AbstractBuilder builder1 = new ConcreteBuilder1();
        AbstractBuilder builder2 = new ConcreteBuilder2();


        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }

}
