package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYuan
 * @date :2019/4/9 16:37
 * @desc :
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 13){
            System.out.printf("当前时间：%d点饿了，午饭；犯困，午休\n",work.getHour());
        }else {
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }

}
