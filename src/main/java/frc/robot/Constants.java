// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Compressor;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /**
     * The left-to-right distance between the drivetrain wheels
     *
     * Should be measured from center to center.
     */
    public static final double DRIVETRAIN_TRACKWIDTH_METERS = Units.inchesToMeters(23.5); // FIXME Measure and set trackwidth
    /**
     * The front-to-back distance between the drivetrain wheels.
     *
     * Should be measured from center to center.
     */
    public static final double DRIVETRAIN_WHEELBASE_METERS = Units.inchesToMeters(23.5); // FIXME Measure and set wheelbase

    public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 27; // FIXME Set front left module drive motor ID
    public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 28; // FIXME Set front left module steer motor ID
    public static final int FRONT_LEFT_MODULE_STEER_ENCODER = 12; // FIXME Set front left steer encoder ID
    public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set front left steer offset

    public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 21; // FIXME Set front right drive motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 22; // FIXME Set front right steer motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 13; // FIXME Set front right steer encoder ID
    public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set front right steer offset

    public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 25; // FIXME Set back left drive motor ID
    public static final int BACK_LEFT_MODULE_STEER_MOTOR = 29; // FIXME Set back left steer motor ID
    public static final int BACK_LEFT_MODULE_STEER_ENCODER = 11; // FIXME Set back left steer encoder ID
    public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set back left steer offset

    public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 23; // FIXME Set back right drive motor ID
    public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 24; // FIXME Set back right steer motor ID
    public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 10; // FIXME Set back right steer encoder ID
    public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set back right steer offset

    // Joystick - ID
        public static final int rightJoystick = 0;
        public static final int leftJoystick = 1;
        public static final int AirHub = 3;
    
//These are the ID values for each button on the joysticks - These can be found in Drivestation on the USB Tab indicated by the green lights that popup when a button is pressed.   
  //Joystick Buttons
  public static int JoystickTriggerR = 1;
  public static int JoystickTriggerL = 1;
  public static int JoystickLeftInside = 4;
  public static int JoystickRightInside = 3;
  public static int JoystickRightOutside = 4;
  public static int JoystickLeftOutside = 3;
  public static int JoystickRightBottom = 2;
  public static int JoystickLeftBottom = 2;
//ID of USB Gamepad - Everything same format as joystick, but for Gamepad
//Gamepad
  public static int gamepad = 3;

//Gamepad Buttons
  public static int GamepadA = 1;
  public static int GamepadB = 2;
  public static int GamepadX = 3;
  public static int GamepadY = 4;
  public static int GamepadL1 = 5;
  public static int GamepadR1 = 6;          
  public static int GamepadR3 = 9;
  public static int GamepadL3 = 10;
  public static int GamepadSelect = 8;

//CAN ID of SpeedContrller responsible for each of the motors used
//Shooter Motor IDs
  public static int SHOOTER_MOTOR_1 = 34;
  public static int SHOOTER_MOTOR_2 = 37;

//Indexer Motors
  public static int RIGHT_INDEX = 38;
  public static int LEFT_INDEX = 33;

//intake Motor
  public static int INTAKE_MOTOR = 30;
  public static int TRANSFER_MOTOR = 36;

//Creates compressor object so it runs when robot is enabled. One line and forget about it     
//compressor
  public static Compressor cp;
  
}
