package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:37
 * @desc :
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 12){
            System.out.printf("当前时间：%d点上午工作，精神百倍！\n",work.getHour());
        }else {
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }

}
