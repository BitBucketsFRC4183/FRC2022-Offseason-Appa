package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class ButtonSystem {

    Joystick joystick = new Joystick(0);

    // Hold Y to activate piston
    public boolean isClimberPressed()
    {
        return joystick.getRawButtonPressed(XboxController.Button.kY.value);
    }

    // Press X to toggle between on and off state
    public boolean isIntakePressed()
    {
        return joystick.getRawButtonPressed(XboxController.Button.kX.value);
    }


    public boolean isShootPressed()
    {
        return joystick.getRawButtonPressed(XboxController.Button.kA.value);
    }


}
