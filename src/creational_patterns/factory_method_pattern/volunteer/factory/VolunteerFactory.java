package creational_patterns.factory_method_pattern.volunteer.factory;

import creational_patterns.factory_method_pattern.volunteer.production.LeiFeng;
import creational_patterns.factory_method_pattern.volunteer.production.Volunteer;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 22:04
 * @desc : 志愿者工厂
 */
public class VolunteerFactory implements LeiFengFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
