package behavioral_patterns.mediatorpattern.intermediary;

/**
 * @author :DengSiYuan
 * @date :2019/4/5 14:48
 * @desc :
 */
public class AgencyMain {

    public static void main(String[] args) {
        HouseTransaction houseTransaction = new HouseTransaction();

        HouseHost houseHost = new HouseHost(houseTransaction);
        HouseBuyer houseBuyer = new HouseBuyer(houseTransaction);

        houseTransaction.setHouseBuyer(houseBuyer);
        houseTransaction.setHouseHost(houseHost);

        houseHost.announce("我现在要卖一个二室一厅的房子！");
        houseBuyer.announce("我要买你的二室一厅的房子！");
    }

}
