package behavioral_patterns.command_pattern.barbecuer;

/**
 * @author :DengSiYuan
 * @date :2019/4/2 9:27
 * @desc :
 */
public class Main1 {

    public static void main(String[] args) {
        //开店前准备
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand1 = new BackMuttonCommand(barbecuer);
        Command bakeMuttonCommand2 = new BackMuttonCommand(barbecuer);
        Command bakeChickWingCommand = new BakeChickenWingCommand(barbecuer);
        Waiter waiter = new Waiter();

        //开门营业 顾客点菜
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeChickWingCommand);

        //点菜完毕，通知厨房
        waiter.nodify();

    }

}
