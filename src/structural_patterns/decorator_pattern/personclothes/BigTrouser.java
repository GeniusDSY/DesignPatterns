package structural_patterns.decorator_pattern.personclothes;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:48
 * @desc : 垮裤类
 */
public class BigTrouser extends Finery {

    @Override
    public void show(){
        System.out.println("垮裤");
        super.show();
    }

}
