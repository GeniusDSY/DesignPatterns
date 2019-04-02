package behavioral_patterns.command_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 16:46
 * @desc :
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }

}
