package structural_patterns.flyweightpattern.websites;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:35
 * @desc :
 */
public class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类:" + name + "用户:" + user.getName());
    }

}
