package structural_patterns.bridge_pattern.software_hardware;

import structural_patterns.bridge_pattern.software_hardware.hardware.CellPhone;
import structural_patterns.bridge_pattern.software_hardware.hardware.CellPhoneA;
import structural_patterns.bridge_pattern.software_hardware.hardware.CellPhoneB;
import structural_patterns.bridge_pattern.software_hardware.software.CellPhoneAddressList;
import structural_patterns.bridge_pattern.software_hardware.software.CellPhoneGame;

/**
 * @author :DengSiYuan
 * @date :2019/3/24 14:15
 * @desc :
 */
public class Bridge_Pattern_Main {

    public static void main(String[] args) {
        CellPhone cellPhone;
        cellPhone = new CellPhoneA();

        cellPhone.setSoftWare(new CellPhoneGame());
        cellPhone.run();

        cellPhone.setSoftWare(new CellPhoneAddressList());
        cellPhone.run();

        cellPhone = new CellPhoneB();
        cellPhone.setSoftWare(new CellPhoneGame());
        cellPhone.run();

        cellPhone.setSoftWare(new CellPhoneAddressList());
        cellPhone.run();
    }

}
