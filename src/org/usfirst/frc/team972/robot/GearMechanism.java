package org.usfirst.frc.team972.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class GearMechanism {
	
	public static void holdGear() {
		Robot.gearPegPiston.set(DoubleSolenoid.Value.kForward);
		Robot.gearPusherPiston.set(DoubleSolenoid.Value.kReverse);
	}
	public static void placeGear() {
		Robot.gearPegPiston.set(DoubleSolenoid.Value.kReverse);
		// TODO: Add wait if necessary
		Robot.gearPusherPiston.set(DoubleSolenoid.Value.kForward);
	}
}