/*
* File: ComicBook.java
* Author: Chase R
* Date: April 10, 2019
* Purpose: Demonstrate the use of classes with constructors, parameters, etc.
*/

//Import Libraries
import java.util.Scanner;
import java.io.IOException;

public class ComicBookLibrary {

  public static void main(String[] args) {

    //Declaring Variables
    String response = "none";
    String secondResponse = "none";
    //Create Comic Book Library Objects
    //This is where you can construct all the comics in your library for future reference
    ComicBook batmanDetective1 = new ComicBook("Batman Detective", "Batman", "Robin", "Joker", 1, 15, "Gotham Sewers", "fight to the death", "locked up in Arkham");
    ComicBook spiderman = new ComicBook("The Amazing Adventures of Spiderman", "Spiderman", "Classmate", "Venom", 23, 144, "New York City", "fight between them on a roof top", "and Spiderman is knocked off");
    ComicBook venom = new ComicBook("Venom", "Venom Returns", "NA", "Carnage", 1, 12, "San Francisco", "battle over which alien is greater", "no one will win....yet");
    ComicBook shazam = new ComicBook("Shazam", "Shazam", "NA", "Black Adam", 2, 17, "Chicago", "duel over who is more powerful", "Shazam temporarily beats him");

    //Brief Introduction
    introduction();

    //Summary of objects
    ComicBook.comicSummary(batmanDetective1);
    ComicBook.comicSummary(venom);
    ComicBook.comicSummary(shazam);
    }

  //This function introduces the program to the user
  public static void introduction() {
    System.out.println("\n Welcome to the Comic Book Libaray!");
    System.out.println("We have a few comics in our libarary at this time");
    System.out.println("Here is our summary.\n");
  }
}
