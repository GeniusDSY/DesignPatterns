package behavioral_patterns.chain_of_responsibility.salary2;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 20:13
 * @desc : 总监
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType() == "请假" && request.getNumber() <= 5){
            System.out.printf("%s:%s数量%d被批准\n",name,request.getRequestContent(),request.getNumber());
        }else {
            if(superior != null){
                superior.requestApplication(request);
            }
        }
    }
}
