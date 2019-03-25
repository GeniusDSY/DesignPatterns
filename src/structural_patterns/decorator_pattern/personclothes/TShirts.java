package structural_patterns.decorator_pattern.personclothes;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:47
 * @desc :
 */
public class TShirts extends Finery {

    @Override
    public void show(){
        System.out.println("大T恤");
        super.show();
    }

}
