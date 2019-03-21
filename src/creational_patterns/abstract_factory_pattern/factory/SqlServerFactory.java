package creational_patterns.abstract_factory_pattern.factory;

import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;
import creational_patterns.abstract_factory_pattern.production.sqlserver.SqlServerDepartment;
import creational_patterns.abstract_factory_pattern.production.sqlserver.SqlServerUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:33
 * @desc : 创建SqlServer连接产品
 */
public class SqlServerFactory implements IFactory {
    /**
     * 生成一个SqlServerUser产品
     *
     * @return IUser
     */
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    /**
     * 生成一个SqlServerDepartment类型的产品
     */
    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
