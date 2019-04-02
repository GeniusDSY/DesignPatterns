package behavioral_patterns.command_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 19:51
 * @desc :
 */
public class ModelMain {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }

}
