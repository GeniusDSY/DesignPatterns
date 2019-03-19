package creational_patterns.factory_method_pattern.volunteer.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 22:01
 * @desc :
 */
public class Volunteer extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("志愿者扫地");
    }

    @Override
    public void wash() {
        System.out.println("志愿者洗衣服");
    }

    @Override
    public void cook() {
        System.out.println("志愿者做饭");
    }
}
