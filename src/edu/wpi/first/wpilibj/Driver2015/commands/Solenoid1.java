/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.Driver2015.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 * @author FrankyMonez
 */
public class Solenoid1 extends CommandBase {
    
    DoubleSolenoid doubleSolenoid = new DoubleSolenoid(1, 2);
    
    public Solenoid1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
