package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 17:38
 * @desc : 中锋
 */
public class Center extends Player{

    public Center(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("中锋%s进攻\n",name);
    }

    @Override
    public void defense() {
        System.out.printf("中锋%s防守\n",name);
    }
}
