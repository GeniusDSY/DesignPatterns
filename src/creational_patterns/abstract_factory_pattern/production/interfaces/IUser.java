package creational_patterns.abstract_factory_pattern.production.interfaces;

import creational_patterns.abstract_factory_pattern.production.entity.User;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:08
 * @desc : 用户表的操作定义
 */
public interface IUser {

    /**
     * 插入数据表
     * @param user
     * */
    void insert(User user);

    /**
     * 得到User的信息
     * @param id
     * @return user
     * */
    User getUser(int id);

}
