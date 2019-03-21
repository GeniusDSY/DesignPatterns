package creational_patterns.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :DengSiYuan
 * @date :2019/3/21 16:53
 * @desc : 产品类，有多个部件组成
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品  创建  ----");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
