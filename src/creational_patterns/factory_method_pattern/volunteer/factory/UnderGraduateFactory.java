package creational_patterns.factory_method_pattern.volunteer.factory;

import creational_patterns.factory_method_pattern.volunteer.production.LeiFeng;
import creational_patterns.factory_method_pattern.volunteer.production.UnderGraduate;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 22:04
 * @desc : 大学生工厂
 */
public class UnderGraduateFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new UnderGraduate();
    }
}
