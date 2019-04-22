/*
* File: HomeworkOne.java
* Author: Chase R
* Date: March 30, 2019
* Purpose: Test knowledge of reading input using scanner,
* understanding of primitive types, good documentation, etc.
*/

//Libraries to be used in this project
import java.io.IOException;
import java.util.Scanner;

/**
*This public class is the main class that runs the program
*/
public class HomeworkOne {

  public static void main(String[] args) throws IOException {

  //Declaring Variables
  int employeeNum = 43023; //Initializing employee number
  double quizOne = 80.6;
  double quizTwo = 82.1;
  double quizThree = 90.3;
  int ageMonths = 384;
  double currentTemp = 19.0;

  // Scanner class performs similar functionality of reading in values
    Scanner scannerIn = new Scanner(System.in);

  // Prompt the user to enter first quiz score
    System.out.print("\nEnter your Student EMPLID (0-999999): ");
  // the nextInt() method scans the next int value
    employeeNum = scannerIn.nextInt();

  // Prompt the user to enter first quiz score
    System.out.print("Enter your quiz1 percentage score (0.0-100.0): ");
  // the nextDouble() method scans the next double value
    quizOne = scannerIn.nextDouble();

  // Prompt the user to enter another double
    System.out.print("Enter your quiz2 percentage score (0.0-100.0): ");
  // the nextDouble() method scans the next double value
    quizTwo = scannerIn.nextDouble();

  // Prompt the user to enter another double
    System.out.print("Enter your quiz3 percentage score (0.0-100.0): ");
  // the nextDouble() method scans the next double value
    quizThree = scannerIn.nextDouble();

  // Prompt the user to enter another int value for age in months
    System.out.print("Enter your age in months (0-1440)): ");
  // the nextInt() method scans the next int value
    ageMonths = scannerIn.nextInt();

  // Prompt the user to enter another double related to temperature
    System.out.print("Enter the current Temperature in degrees Celsius: ");
  // the nextDouble() method scans the next double value
    currentTemp = scannerIn.nextDouble();

  // Print out the summary of information related to quiz scores, employee number, age, temp, etc.
    System.out.println("\n***Thank you***");
    System.out.println("Student EMPLID: " + employeeNum);
    System.out.println("Quiz 1 Score: " + quizOne);
    System.out.println("Quiz 2 Score: " + quizTwo);
    System.out.println("Quiz 3 Score: " + quizThree);
    System.out.println("Average quiz score: " + (quizOne+quizTwo+quizThree)/3);
    System.out.println("Age in months: " + ageMonths);
    System.out.println("Age in years: " + (ageMonths/12));
    System.out.println("Temperature in Celsius: " + currentTemp + "\u00B0");
    System.out.println("Temperature in Fahrenheit: " + (currentTemp*1.8+32) + "\u00B0" + "\n");
  }
}
