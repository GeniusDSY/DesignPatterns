package structural_patterns.adapter_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 15:55
 * @desc : 通过在内部包装一个Adaptee对象,把源接口转换成目标接口
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specificRequest();
    }

}
