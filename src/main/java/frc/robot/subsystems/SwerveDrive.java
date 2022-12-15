package frc.robot.subsystems;

import com.swervedrivespecialties.swervelib.SwerveModule;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import frc.robot.controls.SwerveControls;

import java.util.ArrayList;

public class SwerveDrive {

    final SwerveControls swerveContols;
    FiniteState state;
/*
    WPI_TalonSRX topLeft = new WPI_TalonSRX(1);
    WPI_TalonSRX topRight = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(4);


 */
    private SwerveModule moduleFrontLeft;
    private SwerveModule moduleFrontRight;
    private SwerveModule moduleBackLeft;
    private SwerveModule moduleBackRight;
    private ArrayList<SwerveModule> modules;

    private Translation2d moduleFrontLeftLocation;
    private Translation2d moduleFrontRightLocation;
    private Translation2d moduleBackLeftLocation;
    private Translation2d moduleBackRightLocation;

    public SwerveDrive(SwerveControls swervecontrols, FiniteState driveState) {
        this.swerveContols = swervecontrols;
        this.state = driveState;
    }

    public void periodic() {

        double LR = SwerveControls.getLR();
        double FB = SwerveControls.getFB();

        //turning in place
        if (FB == 0 && LR != 0) {
            setStates(new SwerveModuleState[]{
                    new SwerveModuleState(0, Rotation2d.fromDegrees(FB)), //Front Left
                    new SwerveModuleState(0, Rotation2d.fromDegrees(FB)), //Front Right
                    new SwerveModuleState(0, Rotation2d.fromDegrees(FB)), //Back Left
                    new SwerveModuleState(0, Rotation2d.fromDegrees(FB)) //Back Right
            });

        }

        if (FB == 0 && LR == 0) {
            setStates(new SwerveModuleState[]{
                    new SwerveModuleState(0, Rotation2d.fromDegrees(-45)), //Front Left
                    new SwerveModuleState(0, Rotation2d.fromDegrees(45)), //Front Right
                    new SwerveModuleState(0, Rotation2d.fromDegrees(45)),  //Back Left
                    new SwerveModuleState(0, Rotation2d.fromDegrees(-45)),  //Back Right
            });

        }

        //turning while moving
        else if (getFB != 0 && getLR != 0) {

        }
    }


         public void stopSticky() {
            setStates(new SwerveModuleState[]{
                    new SwerveModuleState(0, Rotation2d.fromDegrees(45)), //Front Left
                    new SwerveModuleState(0, Rotation2d.fromDegrees(-45)), //Front Right
                    new SwerveModuleState(0, Rotation2d.fromDegrees(-45)), //Back Left
                    new SwerveModuleState(0, Rotation2d.fromDegrees(45)) //Back Right
            });
        }



    }




}
