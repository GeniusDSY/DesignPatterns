package creational_patterns.builder_pattern;

import java.awt.*;

/**
 * @author :DengSiYuan
 * @date :2019/3/21 16:47
 * @desc : 抽象建造类（共同属性的提取）
 */
public abstract class AbstractBuilder {

    public abstract void buildProductA();
    public abstract void buildProductB();
    public abstract Product getResult();


}
