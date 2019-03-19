package creational_patterns.factory_method_pattern.volunteer.production;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 21:58
 * @desc : 学雷锋的大学生
 */
public class UnderGraduate extends LeiFeng {

    @Override
    public void sweep() {
        System.out.println("大学生扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生洗衣服");
    }

    @Override
    public void cook() {
        System.out.println("大学生做饭");
    }
}
