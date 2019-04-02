package behavioral_patterns.command_pattern.barbecuer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 9:33
 * @desc :
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    //设置订单
    public void setOrder(Command command){
        if("BakeChickenWingCommand".equals(command.toString())){
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        }else {
            orders.add(command);
            System.out.println("增加订单:" + command.toString() + "时间:" + new Date().toString());
        }
    }

    //取消订单
    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单:" + command.toString() + "时间:" + LocalDate.now().toString());    }

    //通知全部执行
    public void nodify(){
        for (Command c: orders) {
            c.executeConmmand();
        }
    }

}
