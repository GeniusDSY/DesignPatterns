package behavioral_patterns.mediatorpattern.intermediary;

/**
 * @author :DengSiYuan
 * @date :2019/4/5 14:40
 * @desc : 房屋需求者（出售、购买）
 */
public abstract class House {

    protected Agency agency;

    public House(Agency agency) {
        this.agency = agency;
    }
}
