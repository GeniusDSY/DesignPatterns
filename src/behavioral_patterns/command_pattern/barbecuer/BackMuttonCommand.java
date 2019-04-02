package behavioral_patterns.command_pattern.barbecuer;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 9:30
 * @desc :
 */
public class BackMuttonCommand extends Command {

    public BackMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeConmmand() {
        barbecuer.bakeMutton();
    }

}
