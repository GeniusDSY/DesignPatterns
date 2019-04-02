package behavioral_patterns.command_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 16:52
 * @desc :
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
