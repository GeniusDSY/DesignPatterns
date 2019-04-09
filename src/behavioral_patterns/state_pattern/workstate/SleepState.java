package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:44
 * @desc :
 */
public class SleepState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间：%d 太瞌睡了！！\n",work.getHour());
    }
}
