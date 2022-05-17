// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Cannon extends SubsystemBase {   

public static CANSparkMax ShooterMotor1 = new CANSparkMax(Constants.SHOOTER_MOTOR_1, MotorType.kBrushless);
public static CANSparkMax ShooterMotor2 = new CANSparkMax(Constants.SHOOTER_MOTOR_2, MotorType.kBrushless);

public DoubleSolenoid Hood;

  /** Creates a new Cannon. */
  public Cannon() {
    Hood = new DoubleSolenoid(Constants.AirHub,PneumaticsModuleType.REVPH,0,1);
    Hood.set(Value.kForward);
  }
public void GunPowder(double output){
ShooterMotor1.set(output * -1);
ShooterMotor2.set(output * -1);
}

public void Wheel(){
  DoubleSolenoid.Value Web = Hood.get();
 if (Web == Value.kOff || Web == Value.kReverse){
   Hood.set(Value.kForward);
 } else{
   Hood.set(Value.kReverse);
 }
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
