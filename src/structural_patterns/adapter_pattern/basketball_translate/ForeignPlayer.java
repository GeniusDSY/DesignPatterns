package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 17:47
 * @desc :
 */
public class ForeignPlayer {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外籍球员只知道进攻，不知道attack
    public void 进攻(){
        System.out.printf("外籍球员%s进攻\n",name);
    }

    //外籍球员只知道防守，不知道defense
    public void 防守(){
        System.out.printf("外籍球员%s防守\n",name);
    }

}
