/*
* File: TestGuitar.java
* Author: Chase R
* Date: April 13, 2019
* Purpose: To demonstrate the use of classes, as well as call summaries on Guitar objects.
* Also designed to produce random notes and durations for each guitar.
*/

//Libraries
import java.util.ArrayList;
import java.awt.Color;

public class TestGuitar {

  public static void main(String[] args) {

    //Create Guitar Objects
    //Four objects are created with various parameters
    Guitar guitarOne = new Guitar(7, 31.1, "Hendrix", Color.blue);
    Guitar guitarTwo = new Guitar(6, 21.6, "Steinway", Color.red);
    Guitar guitarThree = new Guitar(7, 30.2, "Fender", Color.black);
    Guitar guitarFour = new Guitar(4, 28.7, "Martin-Jones", Color.yellow);

    //Summarizing Components of Guitar Objects
    Guitar.toString(guitarOne); //Calling the summary for Guitar One
    Guitar.playGuitar(); //Calling for 16 random notes and durations

    Guitar.toString(guitarTwo); //Calling the summary for Guitar Two
    Guitar.playGuitar(); //Calling for 16 random notes and durations

    Guitar.toString(guitarThree); //Calling the summary for Guitar Three
    Guitar.playGuitar(); //Calling for 16 random notes and durations

    Guitar.toString(guitarFour); //Calling the summary for Guitar Four
    Guitar.playGuitar(); //Calling for 16 random notes and durations
    }

}
