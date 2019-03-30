package behavioral_patterns.chain_of_responsibility.salary2;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 20:07
 * @desc : 经理
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType() == "请假" && request.getNumber() <= 2){
            System.out.printf("%s:%s数量%d被批准\n",name,request.getRequestContent(),request.getNumber());
        }else {
            if(superior != null){
                superior.requestApplication(request);
            }
        }
    }

}
