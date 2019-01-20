package org.firstinspires.ftc.teamcode.debugging;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class DebuggingHWMap {

    // Declaring and Initializing motors
    public DcMotor leftFrontDrive = null;
    public DcMotor rightFrontDrive = null;
    public DcMotor leftRearDrive = null;
    public DcMotor rightRearDrive = null;

    // Declaring and Initializing servos
    public Servo paddleFront = null;
    public Servo paddleLeft = null;
    public Servo paddleRight = null;
    public Servo paddleBack = null;

    // Declaring and Initializing hardware map
    HardwareMap debuggingHWMap = null;

    // -- Arm speed values --
    // While this does not actually set the speed of the motors for arm control, this does set a
    // variable to a value we can use in an OpMode when the time comes, as this is what we can use
    // for speed control so we do not damage the robot in the process of having the robot arm swing
    // down and hit itself
    double ARM_UP_POWER_VAL = 0.35;
    double ARM_DOWN_POWER_VAL = -0.35;

    // Constructor class
    // This is used to create an object that can be used by other classes and can take in input
    // from other classes, for instance such as our OpMode
    public DebuggingHWMap() {

    }

    // Initialize standard Hardware interfaces
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        debuggingHWMap = ahwMap;

        // Define and Initialize Motors
        leftFrontDrive = debuggingHWMap.get(DcMotor.class, "leftFDrive");
        rightFrontDrive = debuggingHWMap.get(DcMotor.class, "rightFDrive");
        leftRearDrive = debuggingHWMap.get(DcMotor.class, "leftRDrive");
        rightRearDrive = debuggingHWMap.get(DcMotor.class, "rightRDrive");

        // Define and Initialize Servos
        paddleFront = debuggingHWMap.get(Servo.class, "paddleFront");
        paddleLeft = debuggingHWMap.get(Servo.class, "paddleLeft");
        paddleRight = debuggingHWMap.get(Servo.class, "paddleRight");
        paddleBack = debuggingHWMap.get(Servo.class, "paddleBack");

        // Sets direction of motor power
        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        leftRearDrive.setDirection(DcMotor.Direction.REVERSE);
        rightRearDrive.setDirection(DcMotor.Direction.REVERSE);

        // Set all motors to zero power (0)
        leftFrontDrive.setPower(0);
        rightFrontDrive.setPower(0);
        leftRearDrive.setPower(0);
        rightRearDrive.setPower(0);

        // Set all servos to position zero (0)
        paddleFront.setPosition(0);
        paddleLeft.setPosition(0);
        paddleRight.setPosition(0);
        paddleBack.setPosition(0);

        // Set all motors to run without encoders
        // May want to use RUN_USING_ENCODERS if encoders are installed
        leftFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftRearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightRearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}