package structural_patterns.adapter_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 15:55
 * @desc : 需要适配的类
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("特殊请求！！");
    }

}
