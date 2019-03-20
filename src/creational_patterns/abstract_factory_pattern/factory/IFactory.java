package creational_patterns.abstract_factory_pattern.factory;

import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:07
 * @desc : 建造工厂，创建能访问各种数据库的工厂类
 */
public abstract class IFactory {

    /**
     * 生成一个IUser产品
     * @return IUser
     */
    public abstract IUser createUser();

    /**
     * 生成一个IDepartment类型的产品
     * */
    public abstract IDepartment createDepartment();
}
