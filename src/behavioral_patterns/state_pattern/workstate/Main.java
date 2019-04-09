package behavioral_patterns.state_pattern.workstate;

/**
 * @author :DengSiYu
 * @date :2019/4/9 16:57
 * @desc :
 */
public class Main {

    public static void main(String[] args) {
        //紧急项目
        Work project = new Work(new ForenoonState());
        project.setHour(9);
        project.writeProgram();
        project.setHour(10);
        project.writeProgram();
        project.setHour(12);
        project.writeProgram();
        project.setHour(13);
        project.writeProgram();
        project.setHour(14);
        project.writeProgram();
        project.setHour(17);
        project.writeProgram();

        project.setFinish(false);

        project.writeProgram();
        project.setHour(19);
        project.writeProgram();
        project.setHour(22);
        project.writeProgram();
    }

}
