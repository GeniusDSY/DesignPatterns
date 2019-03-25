package structural_patterns.decorator_pattern.personclothes;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:42
 * @desc : 服饰类
 */
public class Finery extends Person {

    protected Person component;

    //打扮
    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void show(){
        if (component !=null){
            component.show();
        }

    }

}
