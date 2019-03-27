package structural_patterns.flyweightpattern.websites;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:47
 * @desc :
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
