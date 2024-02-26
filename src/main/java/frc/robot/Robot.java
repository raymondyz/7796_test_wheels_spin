// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can m--sodify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */

public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

  public VictorSPX L1_drive = new VictorSPX(1);
  public VictorSPX L2_drive = new VictorSPX(1);
  public VictorSPX R1_drive = new VictorSPX(1);
  public VictorSPX R2_drive = new VictorSPX(1);

  @Override
  public void robotInit() {
    L1_drive.set(VictorSPXControlMode.Disabled, 0.5);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {

      L1_drive.set(VictorSPXControlMode.Velocity ,0.5);
      L2_drive.set(VictorSPXControlMode.Velocity ,0.5);
      R1_drive.set(VictorSPXControlMode.Velocity ,0.5);
      R2_drive.set(VictorSPXControlMode.Velocity ,0.5);

  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
