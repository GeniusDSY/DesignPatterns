package behavioral_patterns.mediatorpattern.countries;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 18:18
 * @desc :国家类
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
