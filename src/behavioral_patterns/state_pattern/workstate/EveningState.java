package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:53
 * @desc :
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()){
            work.setCurrent(new RestState());
            work.writeProgram();
        }else {
            if(work.getHour() < 21){
                System.out.printf("当前时间: %d 点 加班哦，疲劳！ \n",work.getHour());
            }else {
                work.setCurrent(new SleepState());
                work.writeProgram();
            }
        }
    }

}
