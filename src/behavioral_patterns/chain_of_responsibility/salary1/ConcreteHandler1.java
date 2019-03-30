package behavioral_patterns.chain_of_responsibility.salary1;

/**
 * @author :DengSiYuan
 * @date :2019/3/30 17:08
 * @desc :
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handlerRequest(int request) {
        if(request >=0 && request < 10){
            System.out.printf("%s处理请求%s\n",this.getClass().getSimpleName(),request);
        }
        else if(successor != null){
            successor.handlerRequest(request);
        }
    }

}
