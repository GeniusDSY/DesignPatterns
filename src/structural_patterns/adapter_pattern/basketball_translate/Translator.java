package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 17:51
 * @desc :
 */
public class Translator extends Player {

    private ForeignPlayer foreignPlayer = new ForeignPlayer();

    public Translator(String name) {
        super(name);
        foreignPlayer.setName(name);
    }

    @Override
    public void attack() {
        foreignPlayer.进攻();
    }

    @Override
    public void defense() {
        foreignPlayer.防守();
    }
}
