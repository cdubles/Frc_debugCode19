/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;


public class Drive extends Command {
  public Drive() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.DriveTrain):
  }
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
     double moveSpeed = OI.drive1.getRawAxis(1);
     double rotateSpeed = OI.drive1.getRawAxis(2):

    Robot.DriveTrain.arcadeDrive(moveSpeed, rotateSpeed);
  }
  @Override
  protected boolean isFinished() {
    return false;
  }
  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.DriveTrain.arcadeDrive(0, 0)
  }
  @Override
  protected void interrupted() {
  }
}
