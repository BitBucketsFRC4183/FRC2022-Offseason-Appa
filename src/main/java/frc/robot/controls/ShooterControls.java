package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;


public class ShooterControls {

    Joystick joystick = new Joystick(0);

    // Press A to toggle shooter between on and off state
    public boolean isShootPressed() { return joystick.getRawButtonPressed(XboxController.Button.kA.value);}

}
