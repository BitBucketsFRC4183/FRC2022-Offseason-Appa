package frc.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel;

import com.revrobotics.CANSparkMax;


public class ShooterSystem {


    public boolean shoot = false;

    final ButtonSystem buttonSystem;



    CANSparkMax topMotor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax bottomMotor = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);

    public ShooterSystem(ButtonSystem buttonSystem) {
        this.buttonSystem = buttonSystem;
    }

    public void periodic(){

        if (buttonSystem.isShootPressed())
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
