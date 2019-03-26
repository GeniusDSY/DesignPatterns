package structural_patterns.facade_pattern.fund;

/**
 * @author :DengSiYuan
 * @date :2019/3/26 9:16
 * @desc :
 */
public class FacadePatternMain {

    public static void main(String[] args) {
        Funding funding = new Funding();
        //基金购买
        funding.buyFund();
        //基金卖出
        funding.sellFund();
    }

}
