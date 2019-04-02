package behavioral_patterns.command_pattern.barbecuer;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 9:29
 * @desc :
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    abstract public void executeConmmand();

}
