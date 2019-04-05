package behavioral_patterns.mediatorpattern.intermediary;

/**
 * @author :DengSiYuan
 * @date :2019/4/5 14:43
 * @desc :
 */
public class HouseTransaction extends Agency {

    private HouseHost houseHost;
    private HouseBuyer houseBuyer;

    public void setHouseBuyer(HouseBuyer houseBuyer) {
        this.houseBuyer = houseBuyer;
    }

    public void setHouseHost(HouseHost houseHost) {
        this.houseHost = houseHost;
    }

    @Override
    public void announce(String message, House house) {
        if(house == houseBuyer){
            houseBuyer.getMessage(message);
        }else {
            houseHost.getMessage(message);
        }
    }
}
