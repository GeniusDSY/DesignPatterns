package behavioral_patterns.command_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 16:30
 * @desc :
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract public void execute();

}
