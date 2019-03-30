package behavioral_patterns.chain_of_responsibility.salary1;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 17:05
 * @desc :
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler handler){
        this.successor = successor;
    }

    public abstract void handlerRequest(int request);

}
