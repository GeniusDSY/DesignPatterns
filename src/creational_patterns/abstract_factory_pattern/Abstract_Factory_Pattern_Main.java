package creational_patterns.abstract_factory_pattern;

import creational_patterns.abstract_factory_pattern.factory.AccessFactory;
import creational_patterns.abstract_factory_pattern.factory.IFactory;
import creational_patterns.abstract_factory_pattern.factory.MySqlFactory;
import creational_patterns.abstract_factory_pattern.factory.SqlServerFactory;
import creational_patterns.abstract_factory_pattern.production.access.AccessUser;
import creational_patterns.abstract_factory_pattern.production.entity.Department;
import creational_patterns.abstract_factory_pattern.production.entity.User;
import creational_patterns.abstract_factory_pattern.production.interfaces.IDepartment;
import creational_patterns.abstract_factory_pattern.production.interfaces.IUser;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 16:36
 * @desc : 抽象工厂模式产品
 */
public class Abstract_Factory_Pattern_Main {

    public static void main(String[] args) {

        User user = new User();
        Department department = new Department();

        System.out.println("创建Access数据库连接");
        //通过工厂接口，选择数据库Access，创建所需要的Access数据库连接对象
        IFactory accessFactory = new AccessFactory();
        //通过Access数据库连接对象，连接Access中User表
        IUser accessUser = accessFactory.createUser();
        accessUser.insert(user);
        accessUser.getUser(1);
        //通过Access数据库连接对象，连接Access中Department表
        IDepartment accessDepartment = accessFactory.createDepartment();
        accessDepartment.insert(department);
        accessDepartment.getDepartment(1);

        System.out.println("----------------------");

        System.out.println("创建SqlServer数据库连接");
        //通过工厂接口，选择数据库SqlServer，创建所需要的SqlServer数据库连接对象
        IFactory sqlServerFactory = new SqlServerFactory();
        //通过SqlServer数据库连接对象，连接SqlServer中User表
        IUser sqlServerUser = sqlServerFactory.createUser();
        sqlServerUser.insert(user);
        sqlServerUser.getUser(1);
        //通过SqlServer数据库连接对象，连接SqlServer中Department表
        IDepartment sqlServerDepartment = sqlServerFactory.createDepartment();
        sqlServerDepartment.insert(department);
        sqlServerDepartment.getDepartment(1);

        System.out.println("----------------------");

        System.out.println("创建Mysql数据库连接");
/*        //通过工厂接口，选择数据库SqlServer，创建所需要的SqlServer数据库连接对象
        IFactory mySqlFactory = new MySqlFactory();
        //通过SqlServer数据库连接对象，连接SqlServer中User表
        IUser mySqlUser = mySqlFactory.createUser();
        mySqlUser.insert(user);
        mySqlUser.getUser(1);
        //通过SqlServer数据库连接对象，连接SqlServer中Department表
        IDepartment mySqlDepartment = mySqlFactory.createDepartment();
        mySqlDepartment.insert(department);
        mySqlDepartment.getDepartment(1);*/
    }

}