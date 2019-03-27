package structural_patterns.flyweightpattern.model;

import java.util.Hashtable;

/**
 * @author :DengSiYuan
 * @date :2019/3/27 21:21
 * @desc : 享元工厂，用来创建并管理FlyWeight对象
 */
public class FlyWeightFactory {

    private Hashtable flyWeights = new Hashtable();

    public FlyWeightFactory() {
        flyWeights.put("X",new ConcreteFlyWeight());
        flyWeights.put("Y",new ConcreteFlyWeight());
        flyWeights.put("Z",new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key){
        return (FlyWeight) flyWeights.get(key);
    }

}
