package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 16:09
 * @desc : 球员类
 */
public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();

}
