package creational_patterns.abstract_factory_pattern.factory;

import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 17:06
 * @desc : 生成MySql连接的Mysql工厂
 */
public class MySqlFactory extends IFactory {
    /**
     * 生成一个IUser产品
     *
     * @return IUser
     */
    @Override
    public IUser createUser() {
        return null;
    }

    /**
     * 生成一个IDepartment类型的产品
     */
    @Override
    public IDepartment createDepartment() {
        return null;
    }
}
