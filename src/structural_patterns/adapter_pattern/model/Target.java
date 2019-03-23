package structural_patterns.adapter_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 15:52
 * @desc : 客户所期待的接口。目标可以时具体的或抽象的类，也可以是接口
 */
public class Target {

    public void request(){
        System.out.println("普通请求！！");
    }

}
