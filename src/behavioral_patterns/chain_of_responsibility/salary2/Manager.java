package behavioral_patterns.chain_of_responsibility.salary2;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 20:06
 * @desc :
 */
public abstract class Manager {

    protected String name;
    //管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    //设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplication(Request request);
}
