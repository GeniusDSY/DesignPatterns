package behavioral_patterns.chain_of_responsibility.salary2;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 20:18
 * @desc :
 */
public class Main {

    public static void main(String[] args) {
        CommonManager manager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        manager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("垃圾请假");
        request.setNumber(1);
        manager.requestApplication(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("垃圾请假");
        request1.setNumber(4);
        manager.requestApplication(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContent("小菜请求加薪");
        request2.setNumber(500);
        manager.requestApplication(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(1000);
        manager.requestApplication(request3);
    }

}
