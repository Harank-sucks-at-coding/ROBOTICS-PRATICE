// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsytem extends SubsystemBase {
  /** Creates a new DriveSubsytem. */
  public (DriveSubsystem)
    resetEncoders();
  private static final WPI_TalonFX leftBackMotor= RobotMap.leftBackDriveMotor;
private static final WPI_TalonFx rightBackMotor= RobotMap.rightBackDriveMotor;
private static final WPI_TalonFX leftFrontMotor= RobotMap.leftFrontDriveMotor;
private static final WPI_TalonFX rightFrontMotor= RobotMap.rightFrontDriveMotor;
private static final double IN_TO_M=.0254;
private static final int MOTOR_ENCODER_CODES_PER_REV=2048;
private static final double DIAMTER_INCHES=5.0;
private static final double WHEEL_DIAMETER= DIAMETER_INCHES*IN_TO_M;
private static final double WHEEL_CIRCUMFRENCE = WHEEL_DIAMETER*Math.Pi;
private static final double GEAR_RATIO= 12.75;
private static final double TICKS_PER_METER=(MOTOR_ENCODER_CODES_PER_REV*GEAR_RATIO)/WHEEL_CIRCUMFRENCE;
private static final double METERS_PER_TICKS=1/TICKS_PER_METER;
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
