package structural_patterns.proxy_pattern.gift;

/**
 * @author :DengSiYuan
 * @date :2019/3/28 11:43
 * @desc :
 */
public class ProxyMain {

    public static void main(String[] args) {
        SchoolGirl jingjing = new SchoolGirl();
        jingjing.setName("静静");

        Proxy dsy = new Proxy(jingjing);

        dsy.giveDolls();
        dsy.giveFlowers();
        dsy.giveChocolate();
    }

}
