// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Constants.LimelightConstants;

public class LimelightSubsystem extends CommandBase {
  public static NetworkTable limelightTable = NetworkTableInstance.getDefault().getTable("limelight");
  public static NetworkTableEntry tx = limelightTable.getEntry("tx");
  public static NetworkTableEntry ty = limelightTable.getEntry("ty");


  public static double limelight_x = (Double) tx.getDouble(0.0);
  public static double limelight_y = (Double) ty.getDouble(0.0);

  public LimelightSubsystem() {
  limelightTable.getEntry("ledMode").setNumber(Constants.LimelightConstants.FORCE_OFF);
  limelightTable.getEntry("camMode").setNumber(Constants.LimelightConstants.DRIVER_CAMERA); 
  }

  public static void getLimelightData(){
    limelight_x = (Double) limelightTable.getEntry("tx").getDouble(0.0);
    limelight_y = (Double) limelightTable.getEntry("ty").getDouble(0.0);
  }
  public static double getLimelightX(){
    return (Double) limelightTable.getEntry("ty").getDouble(0.0);
  }
  public static double getLimelightY(){
    return (Double) limelightTable.getEntry("ty").getDouble(0.0);
  }

  public static void turn_LED_ON(){
    limelightTable.getEntry("ledMode").setNumber(LimelightConstants.FORCE_ON);
  }
  public static void SetVisonProcessor(){
    limelightTable.getEntry("camMode").setNumber(LimelightConstants.VISON_PROCESSOR);
    turn_LED_ON();
  }

  public static double getHorizontalDistance(){
    double targetOffsetAngle_Vertical = getLimelightY();
    double limelightMountAngleDegrees = 30;
    double limelightHeight = 1.0922;
    double goalHeight = 2.6416;
    double angleToGoal = limelightMountAngleDegrees + targetOffsetAngle_Vertical;
    double angleToGoalRadians = angleToGoal * (Math.PI / 180.0);
    double distance = (goalHeight-limelightHeight)/Math.tan(angleToGoalRadians);
    return distance; 
  }

public static boolean isWithinDistance(){
  return (getHorizontalDistance()<=5 && getHorizontalDistance()>=1.7);
}
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
