package structural_patterns.bridge_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:31
 * @desc :
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }

}
