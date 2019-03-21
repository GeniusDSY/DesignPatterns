package creational_patterns.abstract_factory_pattern.production.access;

import creational_patterns.abstract_factory_pattern.production.entity.User;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:12
 * @desc : Access操作User表
 */
public class AccessUser implements IUser {
    /**
     * 插入数据表
     *
     * @param user
     */
    @Override
    public void insert(User user) {
        System.out.println("ACCESS 插入一条User信息");
    }

    /**
     * 得到User的信息
     *
     * @param id
     * @return user
     */
    @Override
    public User getUser(int id) {
        System.out.println("ACCESS 查询一条User信息");
        return null;
    }
}
