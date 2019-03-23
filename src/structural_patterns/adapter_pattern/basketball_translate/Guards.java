package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 17:41
 * @desc : 后卫
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("后卫%s进攻\n",name);
    }

    @Override
    public void defense() {
        System.out.printf("后卫%s防守\n",name);
    }
}
