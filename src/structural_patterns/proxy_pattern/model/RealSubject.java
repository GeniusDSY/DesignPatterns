package structural_patterns.proxy_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/28 12:09
 * @desc :
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }

}
