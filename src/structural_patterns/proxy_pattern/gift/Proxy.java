package structural_patterns.proxy_pattern.gift;

/**
 * @author :DengSiYuan
 * @date :2019/3/28 11:42
 * @desc :
 */
public class Proxy implements IGiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
