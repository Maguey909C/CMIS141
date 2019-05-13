/*
* File: TestStateDataEntry.java
* Author: Chase R
* Date: 5/5/19
* Purpose: Demonstrate how a small program can call class objects through arrays.
*/

//Import the necessary Libraries
import java.util.ArrayList;
import java.util.Scanner;

//Public Class
public class TestStateDataEntry {

  public static void main(String[] args) {

    //An array of all the StateDataEntry Objects with their respecrive bird, and flower
    StateDataEntry[] stateList = new StateDataEntry[] {
      new StateDataEntry("Alabama", "Yellowhammer", "Camellia"),
      new StateDataEntry("Alaska", "Willow Ptarmigan", "Forget-me-not"),
      new StateDataEntry("Arizona", "Cactus Wren", "Saguaro Cactus"),
      new StateDataEntry("Arkansas", "Mockingbird", "Apple Blossom" ),
      new StateDataEntry("California", "California Valley Quail", "Golden Poppy"),
      new StateDataEntry("Colorado", "Lark Bunting", "Rocky Mountain Columbine"),
      new StateDataEntry("Connecticut", "Robin", "Mountain Laurel"),
      new StateDataEntry("Delaware", "Blue Hen Chicken", "Peach Blossom"),
      new StateDataEntry("Florida", "Mockingbird", "Orange Blossom"),
      new StateDataEntry("Georgia", "Brown Thrasher", "Cherokee Rose"),
      new StateDataEntry("Hawaii", "Nene", "Hibiscus"),
      new StateDataEntry("Idaho", "Mountain Bluebird", "Syringa"),
      new StateDataEntry("Illinois", "Cardinal", "Native violet"),
      new StateDataEntry("Indiana", "Cardinal", "Peony"),
      new StateDataEntry("Iowa", "Eastern Goldfinch", "Wild Rose"),
      new StateDataEntry("Kansas", "Western Meadowlark", "Native Sunflower"),
      new StateDataEntry("Kentucky", "Cardinal", "Goldenrod"),
      new StateDataEntry("Louisiana", "Eastern Brown Pelican", "Magnolia"),
      new StateDataEntry("Maine", "Checkadee", "Pine cone & tassle"),
      new StateDataEntry("Maryland", "Baltimore Oriole", "Black Eyed Susan"),
      new StateDataEntry("Massachusetts", "Chickadee", "Mayflower"),
      new StateDataEntry("Michigan", "Robin", "Apple Blossom"),
      new StateDataEntry("Minnesota", "Common Loon", "Lady Slipper"),
      new StateDataEntry("Mississippi", "Mockingbird", "Magnolia"),
      new StateDataEntry("Missouri", "Bluebird", "Hawthorn"),
      new StateDataEntry("Montana", "Western Meadowlark", "Bitterroot"),
      new StateDataEntry("Nebraska", "Western Meadowlark", "Goldenrod"),
      new StateDataEntry("Nevada", "Mountain Bluebird", "Sagebrush"),
      new StateDataEntry("New Hampshire", "Purple Finch", "Purple Lilac"),
      new StateDataEntry("New Jersey", "Eastern Goldfinch", "Purple Violet"),
      new StateDataEntry("New Mexico", "Roadrunner", "Yucca"),
      new StateDataEntry("New York", "Bluebird", "Rose"),
      new StateDataEntry("North Carolina", "Cardinal", "Dogwood"),
      new StateDataEntry("North Dakota", "Western Meadowlark", "Wild Prairie Rose"),
      new StateDataEntry("Ohio", "Cardinal", "Scarlet Carnation"),
      new StateDataEntry("Oklahoma", "Scissor-tailed Flycatcher", "Mistletoe"),
      new StateDataEntry("Oregon", "Western Meadowlark", "Oregon Grape"),
      new StateDataEntry("Pennsylvania", "Ruffed Grouse", "Mountain Laurel"),
      new StateDataEntry("Rhode Island", "Rhode Island Red", "Violet"),
      new StateDataEntry("South Carolina", "Great Carolina Wren", "Yellow Jessamine"),
      new StateDataEntry("South Dakota", "Ring necked Pheasant", "Pasque Flower"),
      new StateDataEntry("Tennessee", "Mockingbird", "Purple Iris"),
      new StateDataEntry("Texas", "Mockingbird", "Texas Blue Bonnet"),
      new StateDataEntry("Utah", "American Seagull", "Sego Lily"),
      new StateDataEntry("Vermont", "Hermit Thrush", "Red Clover"),
      new StateDataEntry("Virginia", "Cardinal", "Dogwood"),
      new StateDataEntry("Washington", "Willow Goldfinch", "Western Rhododendron"),
      new StateDataEntry("West Virginia", "Cardinal", "Rhododendron"),
      new StateDataEntry("Wisconsin", "Robin", "Wood Violet"),
      new StateDataEntry("Wyoming", "Western Meadowlark", "Indian paint brush")
    };

      // Use the Scanner class to perform reading in
    Scanner scannerIn = new Scanner(System.in);
    //Keep track of all of users queries
    ArrayList<String> exitSummaryList = new ArrayList<String>();

    //Main Program
    //The program will continuously run pulling up states specified in stdin, unless the string none is passed.
    while (true){
      System.out.println("Enter a State or None to exit");
      String response = scannerIn.nextLine().toLowerCase().replaceAll("\\s","");  //reads in user input, the entire string, lowers it, and replaces white space
      if(response.equals("none")){
        exitStatement(exitSummaryList); //Calls the exit function to summary findings
        break;
      }
      else {
        String stateAnswer = findMonth(response,stateList);
        exitSummaryList.add(stateAnswer); //adding thie string answer back to an array list exitSummaryList
        }
      }
    }

    //Function: Summarizes what the user found and says goodbye
    //Input: Array List of all the users queries
    //Output: A summary
    public static void exitStatement(ArrayList<String> results){
      System.out.println("\n**** Thank you *****");
      System.out.println("A summary report for each State, Bird, and Flower is:");
      System.out.print(results);
      System.out.println("\nPlease visit our site again!\n");
    }

    //Function: To call on state objects
    //Input: User reponse string, and an arry of the state oubjects
    //Output: Taken by case, it will call the summary method to print a summary of the state attributes
    public static String findMonth(String stringResponse, StateDataEntry[] listOfStates) {
      switch(stringResponse) {
        case "alabama":
          StateDataEntry.summary(listOfStates[0]);
          return StateDataEntry.stringSummary(listOfStates[0]);
        case "alaska":
          StateDataEntry.summary(listOfStates[1]);
          return StateDataEntry.stringSummary(listOfStates[1]);
        case "arizona":
          StateDataEntry.summary(listOfStates[2]);
          return StateDataEntry.stringSummary(listOfStates[2]);
        case "arkansas":
          StateDataEntry.summary(listOfStates[3]);
          return StateDataEntry.stringSummary(listOfStates[3]);
        case "california":
          StateDataEntry.summary(listOfStates[4]);
          return StateDataEntry.stringSummary(listOfStates[4]);
        case "colorado":
          StateDataEntry.summary(listOfStates[5]);
          return StateDataEntry.stringSummary(listOfStates[5]);
        case "connecticut":
          StateDataEntry.summary(listOfStates[6]);
          return StateDataEntry.stringSummary(listOfStates[6]);
        case "delaware":
          StateDataEntry.summary(listOfStates[7]);
          return StateDataEntry.stringSummary(listOfStates[7]);
        case "flordia":
          StateDataEntry.summary(listOfStates[8]);
          return StateDataEntry.stringSummary(listOfStates[8]);
        case "georgia":
          StateDataEntry.summary(listOfStates[9]);
          return StateDataEntry.stringSummary(listOfStates[9]);
        case "hawaii":
          StateDataEntry.summary(listOfStates[10]);
          return StateDataEntry.stringSummary(listOfStates[10]);
        case "idaho":
          StateDataEntry.summary(listOfStates[11]);
          return StateDataEntry.stringSummary(listOfStates[11]);
        case "illinois":
          StateDataEntry.summary(listOfStates[12]);
          return StateDataEntry.stringSummary(listOfStates[12]);
        case "indiana":
          StateDataEntry.summary(listOfStates[13]);
          return StateDataEntry.stringSummary(listOfStates[12]);
        case "iowa":
          StateDataEntry.summary(listOfStates[14]);
          return StateDataEntry.stringSummary(listOfStates[14]);
        case "kansas":
          StateDataEntry.summary(listOfStates[15]);
          return StateDataEntry.stringSummary(listOfStates[15]);
        case "kentucky":
          StateDataEntry.summary(listOfStates[16]);
          return StateDataEntry.stringSummary(listOfStates[16]);
        case "louisiana":
          StateDataEntry.summary(listOfStates[17]);
          return StateDataEntry.stringSummary(listOfStates[17]);
        case "maine":
          StateDataEntry.summary(listOfStates[18]);
          return StateDataEntry.stringSummary(listOfStates[18]);
        case "maryland":
          StateDataEntry.summary(listOfStates[19]);
          return StateDataEntry.stringSummary(listOfStates[19]);
        case "massachusetts":
          StateDataEntry.summary(listOfStates[20]);
          return StateDataEntry.stringSummary(listOfStates[20]);
        case "michigan":
          StateDataEntry.summary(listOfStates[21]);
          return StateDataEntry.stringSummary(listOfStates[21]);
        case "minnesota":
          StateDataEntry.summary(listOfStates[22]);
          return StateDataEntry.stringSummary(listOfStates[22]);
        case "mississippi":
          StateDataEntry.summary(listOfStates[23]);
          return StateDataEntry.stringSummary(listOfStates[23]);
        case "missouri":
          StateDataEntry.summary(listOfStates[24]);
          return StateDataEntry.stringSummary(listOfStates[24]);
        case "montana":
          StateDataEntry.summary(listOfStates[25]);
          return StateDataEntry.stringSummary(listOfStates[25]);
        case "nebraska":
          StateDataEntry.summary(listOfStates[26]);
          return StateDataEntry.stringSummary(listOfStates[26]);
        case "nevada":
          StateDataEntry.summary(listOfStates[27]);
          return StateDataEntry.stringSummary(listOfStates[27]);
        case "newhampshire":
          StateDataEntry.summary(listOfStates[28]);
          return StateDataEntry.stringSummary(listOfStates[28]);
        case "newjersey":
          StateDataEntry.summary(listOfStates[29]);
          return StateDataEntry.stringSummary(listOfStates[29]);
        case "newmexico":
          StateDataEntry.summary(listOfStates[30]);
          return StateDataEntry.stringSummary(listOfStates[30]);
        case "newyork":
          StateDataEntry.summary(listOfStates[31]);
          return StateDataEntry.stringSummary(listOfStates[31]);
        case "northcarolina":
          StateDataEntry.summary(listOfStates[32]);
          return StateDataEntry.stringSummary(listOfStates[32]);
        case "northdakota":
          StateDataEntry.summary(listOfStates[33]);
          return StateDataEntry.stringSummary(listOfStates[33]);
        case "ohio":
          StateDataEntry.summary(listOfStates[34]);
          return StateDataEntry.stringSummary(listOfStates[34]);
        case "oklahoma":
          StateDataEntry.summary(listOfStates[35]);
          return StateDataEntry.stringSummary(listOfStates[35]);
        case "oregon":
          StateDataEntry.summary(listOfStates[36]);
          return StateDataEntry.stringSummary(listOfStates[36]);
        case "pennsylvania":
          StateDataEntry.summary(listOfStates[37]);
          return StateDataEntry.stringSummary(listOfStates[37]);
        case "rhodeisland":
          StateDataEntry.summary(listOfStates[38]);
          return StateDataEntry.stringSummary(listOfStates[38]);
        case "southcarolina":
          StateDataEntry.summary(listOfStates[39]);
          return StateDataEntry.stringSummary(listOfStates[39]);
        case "southdakota":
          StateDataEntry.summary(listOfStates[40]);
          return StateDataEntry.stringSummary(listOfStates[40]);
        case "tennessee":
          StateDataEntry.summary(listOfStates[41]);
          return StateDataEntry.stringSummary(listOfStates[41]);
        case "texas":
          StateDataEntry.summary(listOfStates[42]);
          return StateDataEntry.stringSummary(listOfStates[42]);
        case "utah":
          StateDataEntry.summary(listOfStates[43]);
          return StateDataEntry.stringSummary(listOfStates[43]);
        case "vermont":
          StateDataEntry.summary(listOfStates[44]);
          return StateDataEntry.stringSummary(listOfStates[44]);
        case "virginia":
          StateDataEntry.summary(listOfStates[45]);
          return StateDataEntry.stringSummary(listOfStates[45]);
        case "washington":
          StateDataEntry.summary(listOfStates[46]);
          return StateDataEntry.stringSummary(listOfStates[46]);
        case "westvirginia":
          StateDataEntry.summary(listOfStates[47]);
          return StateDataEntry.stringSummary(listOfStates[47]);
        case "wisconsin":
          StateDataEntry.summary(listOfStates[48]);
          return StateDataEntry.stringSummary(listOfStates[48]);
        case "wyoming":
          StateDataEntry.summary(listOfStates[49]);
          return StateDataEntry.stringSummary(listOfStates[49]);
        }
        return "State Not Recognized";
      }
}
