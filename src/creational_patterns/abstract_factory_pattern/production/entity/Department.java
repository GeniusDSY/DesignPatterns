package creational_patterns.abstract_factory_pattern.production.entity;

/**
 * @author :DengSiYuan
 * @date :2019/3/20 15:58
 * @desc : 部门表
 */
public class Department {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
