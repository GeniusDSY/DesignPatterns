package creational_patterns.factory_method_pattern.volunteer;

import creational_patterns.factory_method_pattern.volunteer.factory.LeiFengFactory;
import creational_patterns.factory_method_pattern.volunteer.factory.UnderGraduateFactory;
import creational_patterns.factory_method_pattern.volunteer.production.LeiFeng;
import creational_patterns.factory_method_pattern.volunteer.production.UnderGraduate;

/**
 * @author :DengSiYuan
 * @date :2019/3/19 22:05
 * @desc :
 */
public class Factory_Method_Pattern_LeiFeng_Main {

    public static void main(String[] args) {
        LeiFengFactory factory = new UnderGraduateFactory();
        LeiFeng underGraduate = factory.createLeiFeng();
        underGraduate.sweep();
        underGraduate.wash();
        underGraduate.cook();
    }

}


