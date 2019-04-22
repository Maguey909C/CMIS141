/*
* File: ComicBook.java
* Author: Chase R
* Date: April 10, 2019
* Purpose: Demonstrate the use of classes with constructors, parameters, etc.
*/

public class ComicBook {

      private String title;
      private String hero;
      private String sideKick;
      private String villain;
      private int edition = 0;
      private int pages = 0;
      private String location;
      private String duelType;
      private String resolution;

        //Constructor
        public ComicBook(String newTitle, String newHero, String newSideKick, String newVillain, int newEdition, int newPages, String newLocation, String newDuelType, String newResolution) {
          title = newTitle;
          hero = newHero;
          villain = newVillain;
          sideKick = newSideKick;
          edition = newEdition;
          pages = newPages;
          location = newLocation;
          duelType = newDuelType;
          resolution = newResolution;
          }

        //Default Comicbook
        public ComicBook() {
          title = "Blank_Title";
          hero = "UNKNOWN";
          sideKick = "UNKNOWN";
          villain = "UNKNOWN";
          edition = 0;
          pages = 0;
          location = "planet";
          duelType = "battle";
          resolution = "NA";
          }

        //Set Methods
        public void setTitle(String newTitle) {
          title = newTitle;
        }

        public void setHero(String newHero) {
          hero = newHero;
        }

        public void setSideKick(String newSideKick) {
          sideKick = newSideKick;
        }

        public void setEdition(int newEdition) {
          edition = newEdition;
        }

        public void setPages(int newPages) {
          pages = newPages;
        }

        public void setLocation(String newLocation) {
          location = newLocation;
        }

        public void newDuelType(String newDuelType) {
          duelType = newDuelType;
        }

        public void setResolution(String newResolution) {
          resolution = newResolution;
        }

        //Getter Methods
        public String getTitle() {
          return title;
        }

        public String getHero() {
          return hero;
        }

        public String getSideKick() {
          if (sideKick=="NA") {
            return "without a sidekick";
          } else {
            return sideKick;
          }
        }

        //What edition the comic is
        public String getEdition() {
          if (edition==1){
            return "1st";
          } else if (edition==2){
            return "2nd";
          }else if (edition==3) {
            return "3rd";
          }else {
            return (edition + "th");
          }
        }

        //Number of pages
        public int getPages() {
          return pages;
        }

        //Name of the Villian
        public String getVillain() {
          return villain;
        }

        //Comic location
        public String getLocation() {
          return location;
        }

        //Comic battle
        public String getDuelType() {
          return duelType;
        }

        //Outcome of the comic
        public String getResolution() {
          return resolution;
        }

        //Full summary of the comic
        public static void comicSummary(ComicBook oneComic) {

          //Summary Statistics on Comic
          System.out.println("Comic Book Stats \n");
          System.out.println("Title: " + oneComic.getTitle());
          System.out.println("Hero: " + oneComic.getHero());
          System.out.println("Sidekick: " + oneComic.getSideKick());
          System.out.println("Villain: " + oneComic.getVillain());
          System.out.println("Location: " + oneComic.getLocation());
          System.out.println("Duel Type: " + oneComic.getDuelType());
          System.out.println("Result: " + oneComic.getResolution());
          System.out.println("Edition: " + oneComic.getEdition());
          System.out.println("Pages: " + oneComic.getPages());

          //Recap
          System.out.println("\nRecap");
          System.out.println("In the world of " + oneComic.getLocation() + " our hero, " + oneComic.getHero() + " will duel " + oneComic.getVillain() +" and " + oneComic.getSideKick() + " in an " + oneComic.getDuelType() + " and " + oneComic.getResolution() + ".");
          System.out.println("The resolution for this comic book is " + oneComic.getResolution() + ".");
          System.out.println("This comic is " + oneComic.getPages() + " pages and is considered to be a " + oneComic.getEdition() + " edition.\n");
        }

}
