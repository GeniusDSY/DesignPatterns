package behavioral_patterns.chain_of_responsibility.salary2;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 20:16
 * @desc : 总经理
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestContent() == "请假"){
            System.out.printf("%s:%s数量%d被批准\n",name,request.getRequestContent(),request.getNumber());
        }else if (request.getRequestType() == "加薪" && request.getNumber() <= 500){
            System.out.printf("%s:%s数量%d被批准\n",name,request.getRequestContent(),request.getNumber());
        }else if (request.getRequestType() == "加薪" && request.getNumber() > 500){
            System.out.printf("%s:%s数量%d再说吧\n",name,request.getRequestContent(),request.getNumber());

        }
    }
}
