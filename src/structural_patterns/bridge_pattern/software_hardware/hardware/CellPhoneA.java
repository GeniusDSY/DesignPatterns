package structural_patterns.bridge_pattern.software_hardware.hardware;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:11
 * @desc : 具体手机品牌A
 */
public class CellPhoneA extends CellPhone{

    @Override
    public void run() {
        softWare.run();
    }

}
