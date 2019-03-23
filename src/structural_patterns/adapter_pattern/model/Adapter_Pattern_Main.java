package structural_patterns.adapter_pattern.model;

/**
 * @author :DengSiYuan
 * @date :2019/3/23 16:02
 * @desc :
 */
public class Adapter_Pattern_Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
