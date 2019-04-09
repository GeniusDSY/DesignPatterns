package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:37
 * @desc :
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 17){
            System.out.printf("当前时间：%d点下午状态还不错，继续努力！\n",work.getHour());
        }else {
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }

}
