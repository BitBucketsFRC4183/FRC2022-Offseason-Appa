package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class PneumaticsContols {

    Joystick joystick = new Joystick(0);

    // Press Y to toggle piston between on and off state
    public boolean isClimberPressed()
    {
        return joystick.getRawButtonPressed(XboxController.Button.kY.value);
    }

    // Press X to toggle between on and off state
    public boolean isIntakePressed()
    {
        return joystick.getRawButtonPressed(XboxController.Button.kX.value);
    }

}
