package creational_patterns.builder_pattern;

/**
 * @author :DengSiYuan
 * @date :2019/3/21 16:59
 * @desc : 具体建造类2
 */
public class ConcreteBuilder2 extends AbstractBuilder{

    private Product product = new Product();

    @Override
    public void buildProductA() {
        product.add("建造2 部件 A");
    }

    @Override
    public void buildProductB() {
        product.add("建造2 部件 B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
