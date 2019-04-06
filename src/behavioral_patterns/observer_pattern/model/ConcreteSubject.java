package behavioral_patterns.observer_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/4/6 14:56
 * @desc :
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
