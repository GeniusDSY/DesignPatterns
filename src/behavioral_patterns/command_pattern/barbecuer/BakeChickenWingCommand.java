package behavioral_patterns.command_pattern.barbecuer;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 9:32
 * @desc :
 */
public class BakeChickenWingCommand extends Command{

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeConmmand() {
        barbecuer.backChickWing();
    }

    @Override
    public String toString() {
        return "BakeChickenWingCommand";
    }
}
