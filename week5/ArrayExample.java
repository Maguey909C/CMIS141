/*
* File: ArrayExample.java
* Author: Chase R
* Date: April 17, 2019
* Purpose: Demonstrate the use of a loop iterating over an array,
* .
*/

//Import Libraries needed for the program
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayExample {

  public static void main(String[] args) {
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

    //At this point the array is not sorted
    System.out.println("\nplayGuitar() (BEFORE):\n\n"+answer+"\n");

    //We will call the sort method on the ArrayList to sort alphabetically
    Collections.sort(answer);

    System.out.println("\nplayGuitar() (AFTER):\n\n"+answer+"\n");  //ArrayList<string> answer is read out here
  }
}
