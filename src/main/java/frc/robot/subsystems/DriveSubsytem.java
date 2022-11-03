// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsytem extends SubsystemBase {
  /** Creates a new DriveSubsytem. 
   * @return */
  public DriveSubsystem();
   public void resetEncoders(){
    backLeftMotor.setSelectedSensorPosition(0);
    backRightMotor.setSelectedSensorPosition(0);
    frontLeftMotor.setSelectedSensorPosition(0);
    frontRightMotor.setSelectedSensorPosition(0);
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

public static void drive(double throttle, double rotate){
  leftFrontMotor.set(throttle+rotate);
  rightFrontMotor.set(throttle-rotate);
  leftBackMotor.set(throttle+rotate);
  rightBackMotor.set(throttle-rotate);
}
public double GetRightBackEncoderPosition(){
  return rightBackMotor.getSelectedSensorPosition();
}
public double distanceTravelledinTicks(){
  return(getLeftBackEncoderPosition()+GetRightBackEncoderPosition())/2;
}
public double getLeftBackEncoderVelocityMetersPerSecond(){
  double leftVelocityMPS=(leftBackMotor.getSelectedSensorVelocity()*10);
  leftVelocityMPS=leftVelocityMPS*METERS_PER_TICKS;
  return(leftVelocityMPS);
}
public double leftDistanceTravelledInMeters(){
  double left_dist= getLeftBackEncoderPosition()*METERS_PER_TICKS;
  return left_dist;}
  public void stop(){
    drive(0,0);
  }
  frontLeftMotor.set(ControlMode.Follower, backLeftMotor.getDeviceID());
  frontRightMotor.set(ControlMode.Follower, backRightMotor.getDeviceID());
  leftMotor.setNuetralMode(NuetralMode.Coast);
  rightMotor.setNuetralMode(NuetralMode.Coast);
  leftMotorFront.configNominalOutputForward(0,TIMEOUT_MS);
  leftMotorFront.configNominalOutputReverse(0,TIMEOUT_MS);
  leftMotorFront.configPeakOutputForward(1,TIMEOUT_MS);
  leftMotorFront.configPeakOutputReverse(-1, TIMEOUT_MS);
  rightMotorFront.configNominalOutputForward(0,TIMEOUT_MS);
  rightMotorFront.configNominalOutputReverse(0, TIMEOUT_MS);
  rightMotorFront.configPeakOutputForward(1,TIMEOUT_MS);
  rightMotorFront.configPeakOutputReverse(-1,TIMEOUT_MS);
  leftMotorFront.configNuetralDeadband(0.001,TIMEOUT_MS);
  leftMotorBack.configNuetralDeadband(0.001, TIMEOUT_MS);
  rightMotorFront.configNuetralDeadband(0.001,TIMEOUT_MS);
  rightMotorBack.configNuetralDeadband(0.001,TIMEOUT_MS);
  frontLeftMotor.setSensorPhase(true);
  frontRightMotor.setSensorPhase(false);
  backLeftMotor.setSensorPhase(true);
  backRightMotor.setSensorPhase(false);
  frontLeftMotor.setInverted(false);
  backRightMotor.setInverted(true);
  backLeftMotor.setInverted(false);
  

  public DriveSubsytem() {
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public static WPI_TalonFX getLeftbackmotor() {
    return leftBackMotor;
  }
  public static WPI_TalonFx getRightbackmotor() {
    return rightBackMotor;
  }
  public static WPI_TalonFX getLeftfrontmotor() {
    return leftFrontMotor;
  }
  public static WPI_TalonFX getRightfrontmotor() {
    return rightFrontMotor;
  }
  public static double getInToM() {
    return IN_TO_M;
  }
  public static int getMotorEncoderCodesPerRev() {
    return MOTOR_ENCODER_CODES_PER_REV;
  }
  public static double getDiamterInches() {
    return DIAMTER_INCHES;
  }
  public static double getWheelDiameter() {
    return WHEEL_DIAMETER;
  }
  public static double getWheelCircumfrence() {
    return WHEEL_CIRCUMFRENCE;
  }
  public static double getGearRatio() {
    return GEAR_RATIO;
  }
  public static double getTicksPerMeter() {
    return TICKS_PER_METER;
  }
  public static double getMetersPerTicks() {
    return METERS_PER_TICKS;
  }
  public void getCom() {
    return com;
  }
  public void setCom(void com) {
    this.com = com;
  }
  public void getCom() {
    return com;
  }
  public void setCom(void com) {
    this.com = com;
  }
}
