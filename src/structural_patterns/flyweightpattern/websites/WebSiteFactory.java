package structural_patterns.flyweightpattern.websites;

import java.util.Hashtable;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:36
 * @desc :
 */
public class WebSiteFactory {

    private Hashtable webSites = new Hashtable();

    //获得网站分类
    public WebSite getWebSiteCategory(String key){
        if(!webSites.containsKey(key)){
            webSites.put(key,new ConcreteWebSite(key));
        }
        return (WebSite) webSites.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount(){
        return webSites.size();
    }
}
