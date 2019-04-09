package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:43
 * @desc :
 */
public class Work {

    private State current;
    private int hour;
    private boolean finish;

    public Work(State current) {
        this.current = current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

}
