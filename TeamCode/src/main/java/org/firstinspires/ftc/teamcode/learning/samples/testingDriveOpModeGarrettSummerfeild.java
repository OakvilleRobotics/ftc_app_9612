package org.firstinspires.ftc.teamcode.learning.samples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "TestingDriveOpMode", group = "Testing Tutorial")
public class testingDriveOpModeGarrettSummerfeild extends OpMode {

    testingHWMapConnorBuneta robot = new testingHWMapConnorBuneta();

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void init_loop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void loop(){
        double left;
        double right;

        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;

        robot.leftDrive.setPower(-(left));
        robot.rightDrive.setPower(-(right));
    }
}
