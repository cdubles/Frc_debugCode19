/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.Drive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */

public class DriveTrain extends Subsystem {

  public static Talon driveFrontLeft = new Talon(RobotMap.DriveFrontLeft);
  public static Talon driveFrontRIGHT = new Talon(RobotMap.DRIVEFRONT);
 
 public static DifferentialDrive diffDrive == new DifferentialDrive(driveFrontLeft, driveFrontRIGHT);
 
 public void arcadeDrive(double moveSpeed, double rotateSpeed ){
   diffDrive.arcadeDrive(moveSpeed, rotateSpeed);
 }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new Drive());
  }
}
