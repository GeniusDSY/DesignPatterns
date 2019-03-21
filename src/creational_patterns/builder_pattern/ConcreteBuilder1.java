package creational_patterns.builder_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/21 16:56
 * @desc : 具体建造类A
 */
public class ConcreteBuilder1 extends AbstractBuilder {

    private Product product = new Product();

    @Override
    public void buildProductA() {
        product.add("建造1 部件 A");
    }

    @Override
    public void buildProductB() {
        product.add("建造1 部件 B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
