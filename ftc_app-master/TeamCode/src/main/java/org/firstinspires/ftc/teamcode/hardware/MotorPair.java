package org.firstinspires.ftc.teamcode.hardware;

/**
 * Created by BAbel on 4/10/2017.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MotorPair {

    private DcMotor motor1;
    private DcMotor motor2;

    public MotorPair(){
        motor1 = null;
        motor2 = null;
    }

    public MotorPair(HardwareMap hardwareMap, String hardwareName1, String hardwareName2){
        motor1 = hardwareMap.dcMotor.get(hardwareName1);
        motor2 = hardwareMap.dcMotor.get(hardwareName2);
    }

    public void setPower(double power){
        motor1.setPower(power);
        motor2.setPower(power);
    }

    public void stop(){
        motor1.setPower(0);
        motor2.setPower(0);
    }

    public void setFrontPower(double power){
        motor1.setPower(power);
    }
    public void setBackPower(double power){
        motor2.setPower(power);
    }

    public void getFrontPower

}