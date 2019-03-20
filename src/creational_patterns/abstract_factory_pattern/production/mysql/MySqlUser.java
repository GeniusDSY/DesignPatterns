package creational_patterns.abstract_factory_pattern.production.mysql;

import creational_patterns.abstract_factory_pattern.production.entity.User;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 17:08
 * @desc :
 */
public class MySqlUser extends IUser {
    /**
     * 插入数据表
     *
     * @param user
     */
    @Override
    public void insert(User user) {
        System.out.println("Mysql 插入一条User信息");
    }

    /**
     * 得到User的信息
     *
     * @param id
     * @return user
     */
    @Override
    public User getUser(int id) {
        System.out.println("MySql 查询一条User信息");
        return null;
    }
}
