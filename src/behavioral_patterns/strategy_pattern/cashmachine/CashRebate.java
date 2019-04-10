package behavioral_patterns.strategy_pattern.cashmachine;

/**
 * @author :DengSiYuan
 * @date :2019/4/10 22:01
 * @desc :
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}