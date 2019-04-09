package behavioral_patterns.state_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:28
 * @desc : 定义当前实例的状态
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态： " + state.getClass().getSimpleName());
    }

    public void request(){
        state.handle(this);
    }

}
