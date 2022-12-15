package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class SwerveControls {
    Joystick joystick = new Joystick(0);

    public static double getFB()
    {
        if (joystick.getRawAxis(5) > 0.1 || joystick.getRawAxis(5) < -0.1) {
            return joystick.getRawAxis(5);
        }
        else {
            return 0;
        }    }


    public static double getLR()
    {
        if (joystick.getRawAxis(4) > 0.1 || joystick.getRawAxis(4) < -0.1) {
            return joystick.getRawAxis(4);
        }
        else {
            return 0;
        }
    }


}
