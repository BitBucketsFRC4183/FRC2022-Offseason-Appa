package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.controls.PneumaticsContols;

public class PneumaticsSystem extends SubsystemBase{

    DoubleSolenoid climber = new DoubleSolenoid(PneumaticsModuleType.REVPH,  3, 2);
    DoubleSolenoid intake = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 1);

    boolean toggleClimber = false;
    boolean toggleIntake = false;

    final PneumaticsContols pneumaticsControls;

    public PneumaticsSystem(PneumaticsContols pneumaticsControls) {
        this.pneumaticsControls = pneumaticsControls;
    }

    public void openClimber()
    {
        climber.set(DoubleSolenoid.Value.kForward);
    }

    public void closeClimber()
    {
        climber.set(DoubleSolenoid.Value.kReverse);
    }

    public void openIntake() { intake.set(DoubleSolenoid.Value.kForward); }

    public void closeIntake() { intake.set(DoubleSolenoid.Value.kReverse); }


    public void periodic(){

        // Toggles climber between on/off when Y is pressed
        if (pneumaticsControls.isClimberPressed())
        {
            toggleClimber = !toggleClimber;
        }

        if (toggleClimber)
        {
            openClimber();
        }
        else
        {
            closeClimber();
        }

        // Toggles climber between on/off when X is pressed
        if (pneumaticsControls.isIntakePressed())
        {
            toggleIntake = !toggleIntake;
        }

        if (toggleIntake)
        {
            openIntake();
        }
        else
        {
            closeIntake();
        }


    }

}

// slay; you made it to the end of the code 💅

