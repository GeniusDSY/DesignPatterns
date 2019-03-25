package structural_patterns.decorator_pattern.personclothes;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:50
 * @desc :
 */
public class PersonClothesMain {

    public static void main(String[] args) {
        Person p = new Person("邓思远");

        System.out.println("第一种装扮：");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.Decorate(p);
        tShirts.Decorate(tShirts);

        tShirts.show();
    }

}
