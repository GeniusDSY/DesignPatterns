package structural_patterns.bridge_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:33
 * @desc :
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation(){
        implementor.operation();
    }

}
