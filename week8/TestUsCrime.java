/*
File Name: TestUsCrime.java
Author: Chase R
Date: 5/12/2019
Description: Program reads in crime data from external file, prompts user questions about what to access in file, returns a summary of time and output
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class TestUsCrime {

  public static void main(String[] args) throws IOException {

    String fileLine;
    BufferedReader inputStream = null;
    ArrayList<UsCrime> allData = new ArrayList<UsCrime>();
    int userInt = 0;
    long start = System.currentTimeMillis(); //Starts Timing the Program

    try {

      inputStream = new BufferedReader(new FileReader(args[0]));
      inputStream.readLine(); // Skips the first line of the file that has the Headers

      //Reads in the Crime.csv file line by line creating objects for each line
      while ((fileLine = inputStream.readLine()) != null) {
          String[] sarray = fileLine.split(",");
          UsCrime row = new UsCrime(sarray[0],sarray[1],sarray[2],sarray[3],sarray[4],sarray[5],sarray[6],sarray[7],sarray[8],sarray[9],sarray[10],sarray[11],sarray[12],sarray[13],sarray[14],sarray[15],sarray[16],sarray[17], sarray[18], sarray[19]);
          allData.add(row);
        }

        //Introduction to the Program
        System.out.println("\n**** Welcome to the US Crime Statistical Application *****\n");

        //*************Main Block of the program *****************//
        while (true){
          String userAnswer = introPrompt();
          if(userAnswer.equals("q")){  //looks for when the user types in Q or q.  Intro prompt takes care of lowering string
            exitSummary(); //Calls the exit function to summary findings
            break; // Breaks the continuous loop
          }
          else { //Runs remaining analysis of user inputs
            userInt = Integer.parseInt(userAnswer); //Takes user answer as an integer
            System.out.println("");
            String answer = callStats(userInt, allData); //Call on switch function to perform operations based on question
            System.out.println(answer); //Outputs an answer
            }
          }
    } catch (IOException io) {
        System.out.println("File IO exception" + io.getMessage());
    }finally {
        System.out.println(""); //Final output to the program
      }
      long finish = System.currentTimeMillis();
      long timeElapsed = finish - start;
      System.out.print("Elapsed Time:");
      System.out.print(timeElapsed);
      System.out.println("\n");
  }

  //***********************FUCTIONS******************//

  //Function: Function looks year over year what was the  population growtw
  //Input: All the row objects stored as an Array<Class>
  //Output: A string, but within the funciton will will print out the summary of growth for each year
  public static String populationGrowth(ArrayList<UsCrime> allData){
    List<Integer> populationArray = new ArrayList<>();
    List<String> yearList = new ArrayList<>();

    allData.forEach(row -> {
      yearList.add(row.getYear());
      int population = Integer.parseInt(row.getPopulation());
      populationArray.add(population);
    });
    int arrayLength = populationArray.size();
    for (int i = arrayLength-1; i > 0; i--){
      String yearRange = yearList.get(i)+"-"+yearList.get(i-1);
      double diff = populationArray.get(i) - populationArray.get(i-1);
      double a = populationArray.get(i-1);
      double perct = (diff / a)*100;
      System.out.println(yearRange +": "+Double.toString(perct));
    }
    return "\nYearly Growth Summary Complete\n";
  }

  //Function: Determines the year with the highest murder rate
  //Input: All the row objects stored as an Array<Class>
  //Output: A string of the year when the highest murder rate occurred
  public static int maxMurderRate(ArrayList<UsCrime> allData){
    List<Double> murderRateArray = new ArrayList<>();
    List<Integer> yearList = new ArrayList<>();

    allData.forEach(row -> {
      int yearValue = Integer.parseInt(row.getYear());
      yearList.add(yearValue);

      double rateValue = Double.parseDouble(row.getMurderRate());
      murderRateArray.add(rateValue);
    });

    double theMax = Collections.max(murderRateArray);
    int getMurRateIndex = murderRateArray.indexOf(theMax);
    int getMurMaxYear = yearList.get(getMurRateIndex);
    return getMurMaxYear;
  }

  //Function: Determines the year with the lowest murder rate
  //Input: All the row objects stored as an Array<Class>
  //Output: A string of the year when the lowest murder rate occurred
  public static int minMurderRate(ArrayList<UsCrime> allData){
    List<Double> murderRateArray = new ArrayList<>();
    List<Integer> yearList = new ArrayList<>();

    allData.forEach(row -> {
      int yearValue = Integer.parseInt(row.getYear());
      yearList.add(yearValue);

      double rateValue = Double.parseDouble(row.getMurderRate());
      murderRateArray.add(rateValue);
    });

    double theMin = Collections.min(murderRateArray);
    int getMurRateIndex = murderRateArray.indexOf(theMin);
    int getMurMinYear = yearList.get(getMurRateIndex);
    return getMurMinYear;
  }

  //Function: Determines the year with the lowest robbery rate
  //Input: All the row objects stored as an Array<Class>
  //Output: A string of the year when the lowest robbery rate occurred
  public static int minRobberyRate(ArrayList<UsCrime> allData){
    List<Double> robberyRateArray = new ArrayList<>();
    List<Integer> yearList = new ArrayList<>();

    allData.forEach(row -> {
      int yearValue = Integer.parseInt(row.getYear());
      yearList.add(yearValue);

      double rateValue = Double.parseDouble(row.getRobberyRate());
      robberyRateArray.add(rateValue);
    });

    double theMin = Collections.min(robberyRateArray);
    int getRobRateIndex = robberyRateArray.indexOf(theMin);
    int getRobMinYear = yearList.get(getRobRateIndex);
    return getRobMinYear;
  }

  //Function: Determines the year with the highest robbery rate
  //Input: All the row objects stored as an Array<Class>
  //Output: A string of the year when the highest robberty rate occurred
  public static int maxRobberyRate(ArrayList<UsCrime> allData){
    List<Double> robberyRateArray = new ArrayList<>();
    List<Integer> yearList = new ArrayList<>();

    allData.forEach(row -> {
      int yearValue = Integer.parseInt(row.getYear());
      yearList.add(yearValue);

      double rateValue = Double.parseDouble(row.getRobberyRate());
      robberyRateArray.add(rateValue);
    });

    double theMax = Collections.max(robberyRateArray);
    int getRobRateIndex = robberyRateArray.indexOf(theMax);
    int getRobMaxYear = yearList.get(getRobRateIndex);
    return getRobMaxYear;
  }

  //Function: Takes user input based on an integer and then call appropriate function to answer question
  //Input: All the row objects stored as an Array<Class>
  //Output: A string displaying the answer to the question
  public static String callStats(int userInput, ArrayList<UsCrime> allData) {
    switch(userInput) {
      case 1:
        String c1 = populationGrowth(allData);
        return c1;
      case 2:
        String c2 = "The Murder rate was highest in " + Integer.toString(maxMurderRate(allData)) + "\n";
        return c2;
      case 3:
        String c3 = "The Murder rate was lowest in " + Integer.toString(minMurderRate(allData)) + "\n";
        return c3;
      case 4:
        String c4 = "The Robbery rate was highest in " + Integer.toString(maxRobberyRate(allData)) + "\n";
        return c4;
      case 5:
        String c5 = "The Robbery rate was lowest in " + Integer.toString(minRobberyRate(allData)) + "\n";
        return c5;
    }
      return "Your answer is not recognized. Please try again with an appropriate response of 1-5.\n";
  }

  //Fuction: To take user input based on outlined questions
  //Input: None
  //Output: A string based on the user input
  public static String introPrompt(){
    Scanner scannerIn = new Scanner(System.in);
    System.out.println("Enter the number of the question you want to be answered. Enter Q to quit the program:\n");
    System.out.println("1. What were the percentages in the population growth for each consecutive year from 1994-2003?");
    System.out.println("2. What year was the Murder rate the highest?");
    System.out.println("3. What year was the Murder rate the lowest?");
    System.out.println("4. What year was the robbery rate the highest?");
    System.out.println("5. What year was the robbery rate the lowest");
    System.out.println("Q. Quit the program\n");
    System.out.printf("Enter your selection: ");
    String response = scannerIn.nextLine().toLowerCase().replaceAll("\\s","");
    return response;
  }

  //Function: To close the program, and allow user to see how much time has passed
  //Input: None
  //Output: Prints a string and a summary of how much time has elapsed since the program started
  public static void exitSummary(){
    System.out.println("\nThank you for trying the US Crimes Statistics Program!");
  }
}
