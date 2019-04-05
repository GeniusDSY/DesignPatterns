package behavioral_patterns.mediatorpattern.countries;

/**
 * @author :DengSiYuan
 * @date :2019/4/3 18:28
 * @desc :
 */
public class UnitedNationSecurityCouncil extends UnitedNations {

    private Usa colleague1;
    private Iraq colleague2;

    public void setColleague1(Usa colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country colleague) {
        if(colleague == colleague1){
            colleague2.getMessage(message);
        }else {
            colleague1.getMessage(message);
        }
    }

}
