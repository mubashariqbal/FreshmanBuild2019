package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;

public class LogitechControls {

    private final Joystick joy;

    public LogitechControls(int port) {
        joy = new Joystick(port);
    }

    //All buttons
    
    public boolean getXButton() {
        return joy.getRawButton(3);
    }

    public boolean getYButton() {
        return joy.getRawButton(4);
    }

    public boolean getBButton() {
        return joy.getRawButton(2);
    }

    public boolean getAButton() {
        return joy.getRawButton(1);
    }

    //All axes
    
    public double getLeftYAxis() {
        return joy.getRawAxis(1);
    }

    public double getLeftXAxis() {
        return joy.getRawAxis(0);
    }

    public double getRightYAxis() {
        return joy.getRawAxis(5);
    }

    public double getRightXAxis() {
        return joy.getRawAxis(4);
    }

    public double getLeftTrigger() {
        return (joy.getRawAxis(3));
    }

    public double getRightTrigger() {
        return (joy.getRawAxis(4));
    }

    //All DPad that probably won't work
    
    public boolean getDPadUp() {
        return joy.getPOV() == 0;
    }

    public boolean getDPadRight() {
        return joy.getPOV() == 90;
    }

    public boolean getDPadDown() {
        return joy.getPOV() == 180;
    }

    public boolean getDPadLeft() {
        return joy.getPOV() == 270;
    }
}