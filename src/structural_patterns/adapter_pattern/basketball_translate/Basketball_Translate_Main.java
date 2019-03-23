package structural_patterns.adapter_pattern.basketball_translate;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 17:44
 * @desc :
 */
public class Basketball_Translate_Main {

    public static void main(String[] args) {
        Player a = new Forwards("詹姆斯");
        a.attack();
        Player b = new Guards("欧文");
        b.attack();

        //交给适配器翻译官去创建姚明外籍对象
        Player c = new Translator("姚明");
        c.attack();
        c.defense();
    }

}
