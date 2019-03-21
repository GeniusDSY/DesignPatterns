package creational_patterns.abstract_factory_pattern.production.access;

import creational_patterns.abstract_factory_pattern.production.entity.Department;
import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:05
 * @desc : Access操作Department表
 */
public class AccessDepartment implements IDepartment {
    /**
     * 插入数据表
     *
     * @param department
     */
    @Override
    public void insert(Department department) {
        System.out.println("ACCESS 插入一条department信息");
    }

    /**
     * 得到部门表的信息
     *
     * @param id
     */
    @Override
    public Department getDepartment(int id) {
        System.out.println("ACCESS 查询一条department信息");
        return null;
    }
}
