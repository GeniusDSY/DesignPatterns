package creational_patterns.abstract_factory_pattern.production.sqlserver;

import creational_patterns.abstract_factory_pattern.production.entity.Department;
import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:04
 * @desc : SqlServer操作Department表
 */
public class SqlServerDepartment extends IDepartment {
    /**
     * 插入SqlServer数据表
     *
     * @param department
     */
    @Override
    public void insert(Department department) {
        System.out.println("在SQL SERVER 中插入一条department数据");
    }

    /**
     * 从SqlServer得到一条部门信息
     *
     * @param id
     */
    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL SERVER 中查询一条department信息");
        return null;
    }
}
