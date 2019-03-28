package structural_patterns.proxy_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/28 12:12
 * @desc :
 */
public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
