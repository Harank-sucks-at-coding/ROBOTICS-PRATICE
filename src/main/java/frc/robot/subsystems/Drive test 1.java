// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsytem extends SubsystemBase {
  /** Creates a new DriveSubsytem. 
   * @return */
  public DriveSubsystem();
    void resetEncoders() 
public void resetEncoders() {
Object backLeftMotor;
((Object) backLeftMotor).setSelectedSensorPosition(0);
Object frontLeftMotor;
((Object) frontLeftMotor).setSelectedSensorPosition(0);
Object frontRightMotor;
((Object)frontRightMotor).setSelectedSensorPosition(0);
Object backRightMotor;
backRightMotor.setSelectedSensorPosition(0);
}
public double getRightBackEncoderPosition(){
  returnRightBackMotor.getSelectedSensorPosition();
}
public static void drive(double throttle,double rotate){
  leftFrontMotor.set(throttle+rotate);
  rightFrontMotor.set(throttle-rotate);
  leftBackMotor.set(throttle+rotate);
  rightBackMotor.set(throttle-rotate);

}

public double getRightBackEncoderVelocityMetersPerSecond(){
  double leftVelocityMPS=(leftBackMotor.getselectedSensorVelocity()*10);
  leftVelocityMPS=leftVelocityMPS*METERS_PER_TICKS;
  return(leftVelocityMPS);
}
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

leftFrontMotor.set(ControlMode.Follower, leftBackMotor.getDeviceID() );
rightFrontMotor.set(ControlMode.Follower, rightBackMotor.getDeviceID());
void com.ctre.phoenix.motorcontrol.can.WPI_TalonFX.set(ControlMode mode, double value);
void com.ctre.phoinex.motorcontrol.can.WPI_TalonFX.set(ControlMode mode, double value );

leftFrontMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0,1);
leftFrontMotor.configSelectedFeedbackSensor(FeedBackDevice.IntegratedSensor);
leftFrontMotor.configVelocityMesurementPeriod(VelocityMeasPeriod.Period_10Ms);
leftFrontMotor.configVelocityMeasurmentWindow(16);
leftFrontMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1,5,10);
leftBackMotor.setStatusFramePeriod(StatusFrameEnchanced.Status_2_Feedback0,1);
leftBackMotor.configSelectedFeedbackSensor(FeedBackDevice.IntergratedSensor);
leftBackMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_10Ms);
leftBackMotor.configVelocityMeasurmentWindow(16);
leftBackMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1,5,10);
rightFrontMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0,1);
rightFrontMotor.configSelectedFeedbackSensor(FeedBackDevice.IntegratedSensor);
rightFrontMotor.configVelocityMeasurmentPeriod(VelocityMeasPeriod.Period_10Ms);
rightFrontMotor.configVelocityMeasurmentWindow(16);
rightFrontMotor.setStatusFramePeriod(StatusFrameEnchanced.Status_12_Feedback1,5,10);
rightBackMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0,1);
rightBackMotor.configSelectedFeedbackSensor(FeedBackDevice.IntegratedSensor);
rightBackMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.period_10Ms);
rightBackMotor.configVelocityMeasurmentWindow(16)
rightBackMotor.setStatusFramePeriod(StatusFrameEnchanced.Status_12_Feedback1,5,10);


leftFrontMotor.setNeutralMode(NuetralModeCoast):
leftBackMotor.setNuetralMode(NuetralModeCoast);
rightFrontMotor.setNuetralMode(NuetralModeCoast);
rightBackMotor.setNuetralMode(NuetralModeCoast);

leftFrontMotor.setInverted(false);
leftBackMotor.setInverted(true);
rightFrontMotor.setInverted(false);
rightBackMotor.setInverted(true);


public double distanceTravelledinTicks(){
  return(getRightBackEncoderPosition()+getRightBackEncoderPosition())/2;
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
