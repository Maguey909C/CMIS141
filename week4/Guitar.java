/*
* File: Guitar.java
* Author: Chase R
* Date: April 13, 2019
* Purpose: Demonstrate the use of classes with constructors, parameters, etc, as related to a Guitar.
* Also designed to produce random notes and durations for each guitar.
*/

//Importing Libararies needed for the program
import java.util.Random;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;


//Class
public class Guitar {

  //Initializeing Variable with proper types
  private int numStrings;
  private double guitarLength;
  private String guitarManufacturer;
  private Color guitarColor;

  //Constructor Methods for the Guitar
    public Guitar(int newNumStrings, double newGuitarLength, String newGuitarManufacturer, Color newGuitarColor) {
      numStrings = newNumStrings;
      guitarLength = newGuitarLength;
      guitarManufacturer = newGuitarManufacturer;
      guitarColor = newGuitarColor;
      }

    //Default Constructor
    public Guitar() {
      numStrings = 6; //Default value for number of strings
      guitarLength = 8; //Default value for guitar length
      guitarManufacturer = "Gibson"; //Default value of guitar Manufacturer
      Color guitarColor = Color.red; //Default value of guitar color
      }

    //Getter Methods
    public int getNumStrings() {
      return numStrings; //Returning the number of strings from the intialized object
    }

    public double getGuitarLength() {
      return guitarLength; //Returning the guitar length from the intialized object
    }

    public String getGuitarManufacturer() {
      return guitarManufacturer; //Returning the guitar manufacturer name
    }

    public Color getGuitarColor() {
      return guitarColor; //Returning the guitar color
    }

    //Function playGuitar initializes two arrays (duration and nots), and then randomly selects from each of the two arrays 16 times elements which comprise
    //notes as well as durations. As the loop performs the concatenation, the string is put into an ArrayList of strings called answer, until 16 cycles are complete
    //Once the cycle is complete the response is read out to the console with System.out.println(answer)
    public static ArrayList<String> playGuitar() {
      String[] duration = {"0.2", "0.5", "1.0", "2.0", "4.0"};
      String[] notes = {"A","B","C","D","E","F","G"};
      ArrayList<String> answer = new ArrayList<String>();

      Random random = new Random();
      for (int i=0; i<17; i++) {
        int durationIndex = random.nextInt(duration.length);
        int notesIndex = random.nextInt(notes.length);
        String oneNote = notes[notesIndex]+"("+duration[durationIndex]+")";
        answer.add(oneNote);
      }

      System.out.println("playGuitar():"+answer);  //ArrayList<string> answer is read out here
      return answer; //Probably uncessary, but kept for future iterations of this program
    }

    //Function toString() prints a summary of the guitar components
    public static void toString(Guitar guitarDetails) {
      System.out.println("\ntoString(): " + "(numStrings="+guitarDetails.getNumStrings()+","+" Length="+guitarDetails.getGuitarLength()+","+" manufacturer="+guitarDetails.getGuitarManufacturer()+","+" color="+guitarDetails.getGuitarColor()+")");
      System.out.println("getNumStrings(): " + guitarDetails.getNumStrings());
      System.out.println("getGuitarLength(): " + guitarDetails.getGuitarLength());
      System.out.println("getGuitarManufacturer(): " + guitarDetails.getGuitarManufacturer());
      System.out.println("getGuitarColor(): " + guitarDetails.getGuitarColor());
    }

}
