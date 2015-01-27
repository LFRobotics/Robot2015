/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.Driver2015.commands;

import edu.wpi.first.wpilibj.Driver2015.OI;
import edu.wpi.first.wpilibj.Driver2015.subsystems.XBox;



/**
 *
 * @author FrankyMonez
 */
public class DriveTele extends CommandBase {
    
    OI oI = new OI();
    
    public DriveTele() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(base);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        base.mecanumDrive(
                (XBox.LEFTJOY_X+XBox.LEFTJOY_Y)/2,
                (XBox.LEFTJOY_Y-XBox.LEFTJOY_X)/2,
                -(XBox.LEFTJOY_Y-XBox.LEFTJOY_X)/2,
                -(XBox.LEFTJOY_X+XBox.LEFTJOY_Y)/2);
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
