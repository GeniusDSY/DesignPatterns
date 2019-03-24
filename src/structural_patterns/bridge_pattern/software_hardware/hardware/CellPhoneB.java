package structural_patterns.bridge_pattern.software_hardware.hardware;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:14
 * @desc : 具体手机品牌B
 */
public class CellPhoneB extends CellPhone {

    @Override
    public void run() {
        softWare.run();
    }

}
