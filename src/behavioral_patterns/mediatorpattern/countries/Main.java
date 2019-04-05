package behavioral_patterns.mediatorpattern.countries;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 18:30
 * @desc :
 */
public class Main {

    public static void main(String[] args) {
        UnitedNationSecurityCouncil UNSC = new UnitedNationSecurityCouncil();

        Usa c1 = new Usa(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("不准研制核武器，否则要发动战争！");
        c2.declare("我们没有核武器，也不怕侵略！");
    }

}
