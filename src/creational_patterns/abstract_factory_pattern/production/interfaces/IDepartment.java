package creational_patterns.abstract_factory_pattern.production.interfaces;

import creational_patterns.abstract_factory_pattern.production.entity.Department;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 15:54
 * @desc : 部门表，用于客户端访问，解除与具体数据库访问的耦合
 */
public abstract class IDepartment {

    /**
     * 插入数据表
     * @param department
     * */
    public abstract void insert(Department department);

    /**
     * 得到部门表的信息
     * @param id
     * */
    public abstract Department getDepartment(int id);

}
