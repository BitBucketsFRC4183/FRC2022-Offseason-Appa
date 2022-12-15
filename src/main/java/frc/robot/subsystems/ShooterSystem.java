package frc.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel;

import com.revrobotics.CANSparkMax;
import frc.robot.controls.ShooterControls;


public class ShooterSystem {


    public boolean shoot = false;

    final ShooterControls shooterButtons;

    CANSparkMax topMotor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax bottomMotor = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);

    public ShooterSystem(ShooterControls shooterButtons) {
        this.shooterButtons = shooterButtons;
    }

    public void periodic(){

        if (shooterButtons.isShootPressed())
        {
            shoot = !shoot;
        }

        if (shoot)
        {
            shoot();
        }

        else {
            turnOffAll();
        }
    }

    public void turnOffAll()
    {
        topMotor.set(0);
        bottomMotor.set(0);
    }
    public void shoot()
    {
        topMotor.set(.8);
        bottomMotor.set(.65);
    }
}
