/*
* File: HeadPhone.java
* Author: Chase R
* Date: 5/5/19
* Purpose: Demonstrate the use of classes with constructors, parameters, etc. for various states in the US.
*/

//Public Class as indicated by file name
public class StateDataEntry {
  private String state;
  private String bird;
  private String flower;

  //Constructor Methods for the State
    public StateDataEntry(String newState, String newBird, String newFlower) {
      state = newState;
      bird = newBird;
      flower = newFlower;
      }

    //Default Constructor
    public StateDataEntry() {
      state = "Na";
      bird = "Na";
      flower = "Na";
      }

    //Getter Methods
    public String getState() {
      return state;  // Getting State variable
    }

    public String getBird() {
      return bird; // Getting Verb variable
    }

    public String getFlower() {
      return flower; //Getting Flower variable
    }

   //Function: Returns a string summary of the objects attributes, or name, bird, Flower
   //Input: StateDataEntry object
   //Output: A string summary of the attributes for that state
    public static String stringSummary (StateDataEntry results) {
      String totalSummary = results.getState() +","+results.getBird()+","+results.getFlower();
      return totalSummary;
    }

    //Function: Prints a summary of the objects attributes, or name, bird, Flower
    //Input: StateDataEntry object
    //Output: Prints a summary of the attributes for that state
    public static void summary (StateDataEntry results) {

      System.out.println("\nState: " + results.getState());
      System.out.println("Bird: " + results.getBird());
      System.out.println("Flower: " + results.getFlower());
      System.out.print("\n");
    }
}
