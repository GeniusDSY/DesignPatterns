package creational_patterns.abstract_factory_pattern.production.mysql;

import creational_patterns.abstract_factory_pattern.production.entity.Department;
import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 17:09
 * @desc :
 */
public class MySqldepartment extends IDepartment {
    /**
     * 插入数据表
     *
     * @param department
     */
    @Override
    public void insert(Department department) {
        System.out.println("Mysql 插入一条department信息");
    }

    /**
     * 得到部门表的信息
     *
     * @param id
     */
    @Override
    public Department getDepartment(int id) {
        System.out.println("Mysql 查询一条department信息");
        return null;
    }
}
