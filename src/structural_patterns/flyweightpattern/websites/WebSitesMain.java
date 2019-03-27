package structural_patterns.flyweightpattern.websites;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:39
 * @desc :
 */
public class WebSitesMain {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite wx = factory.getWebSiteCategory("产品展示");
        wx.use(new User("dsy"));

        WebSite wy = factory.getWebSiteCategory("产品展示");
        wy.use(new User("kobe"));

        WebSite wz = factory.getWebSiteCategory("产品展示");
        wz.use(new User("Jordan"));

        WebSite wl = factory.getWebSiteCategory("博客");
        wl.use(new User("curry"));

        WebSite wm = factory.getWebSiteCategory("博客");
        wm.use(new User("lancy"));

        WebSite wn = factory.getWebSiteCategory("博客");
        wn.use(new User("james"));

        System.out.printf("网站分类总数为%d",factory.getWebSiteCount());
    }

}
