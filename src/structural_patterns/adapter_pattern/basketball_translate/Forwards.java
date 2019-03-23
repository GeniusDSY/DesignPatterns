package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 17:33
 * @desc : 前锋
 */
public class Forwards extends Player {

    public Forwards(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("前锋%s进攻\n",name);
    }

    @Override
    public void defense() {
        System.out.printf("前锋%s防守\n",name);
    }
}
