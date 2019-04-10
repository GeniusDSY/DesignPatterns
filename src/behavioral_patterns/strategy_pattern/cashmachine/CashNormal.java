package behavioral_patterns.strategy_pattern.cashmachine;

/**
 * @author :DengSiYuan
 * @date :2019/4/10 22:13
 * @desc :
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
            return money;
        }

}
