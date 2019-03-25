package structural_patterns.decorator_pattern.personclothes;

/**
 * @author :DengSiYuan
 * @date :2019/3/25 22:41
 * @desc : 人 类
 */
public class Person {

    private String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.printf("装扮的%s",name);
    }


}
