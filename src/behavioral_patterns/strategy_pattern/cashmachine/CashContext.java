package behavioral_patterns.strategy_pattern.cashmachine;

/**
 * @author :DengSiYuan
 * @date :2019/4/10 22:01
 * @desc :
 */
public class CashContext {

    CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300反100":
                CashReturn cashReturn = new CashReturn(300d,100d);
                cashSuper = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate(0.8);
                cashSuper = cashRebate;
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

}
