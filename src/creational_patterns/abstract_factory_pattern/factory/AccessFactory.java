package creational_patterns.abstract_factory_pattern.factory;

import creational_patterns.abstract_factory_pattern.production.access.AccessDepartment;
import creational_patterns.abstract_factory_pattern.production.access.AccessUser;
import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:34
 * @desc : 创建Access连接产品
 */
public class AccessFactory extends IFactory {
    /**
     * 生成一个AccessUser产品
     *
     * @return IUser
     */
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    /**
     * 生成一个AccessDepartment类型的产品
     */
    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
