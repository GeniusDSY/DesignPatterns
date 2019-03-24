package structural_patterns.bridge_pattern.software_hardware.hardware;

import structural_patterns.bridge_pattern.software_hardware.software.SoftWare;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 13:57
 * @desc : 手机品牌
 */
public abstract class CellPhone {

    protected SoftWare softWare;

    //设置手机软件
    public void setSoftWare(SoftWare softWare){
        this.softWare = softWare;
    }

    public abstract void run();

}
