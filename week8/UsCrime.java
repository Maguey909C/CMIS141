/*
* File: ComicBook.java
* Author: Chase R
* Date: 5/12/2019
* Purpose: Build US Crime objects based on rows from US Crime.csv data.
*/

public class UsCrime {

      private String year;
      private String population;
      private String violentCrime;
      private String violentCrimeRate;
      private String murder;
      private String murderRate;
      private String rape;
      private String rapeRate;
      private String robbery;
      private String robberyRate;
      private String assault;
      private String assaultRate;
      private String property;
      private String propertyRate;
      private String burglary;
      private String burglaryRate;
      private String larceny;
      private String larcenyRate;
      private String vehicle;
      private String vehicleRate;

        //Constructor
        public UsCrime(String nwYear,String nwPopulation,String nwViolentCrime,String nwViolentCrimeRate, String nwMurder,
        String nwMurderRate,String nwRape,String nwRapeRate,String nwRobbery,String nwRobberyRate, String nwAssault,
        String nwAssaultRate,String nwProperty,String nwPropertyRate,String nwBurglary,String nwBurglaryRate,
        String nwLarceny,String nwLarcenyRate,String nwVehicle,String nwVehicleRate) {
          year = nwYear;
          population = nwPopulation;
          violentCrime = nwViolentCrime;
          violentCrimeRate = nwViolentCrimeRate;
          murder = nwMurder;
          murderRate = nwMurderRate;
          rape = nwRape;
          rapeRate = nwRapeRate;
          robbery = nwRobbery;
          robberyRate = nwRobberyRate;
          assault = nwAssault;
          assaultRate = nwAssaultRate;
          property = nwProperty;
          propertyRate = nwPropertyRate;
          burglary = nwBurglary;
          burglaryRate = nwBurglaryRate;
          larceny = nwLarceny;
          larcenyRate = nwLarcenyRate;
          vehicle = nwVehicle;
          vehicleRate = nwVehicleRate;
          }

        //Default UsCrime
        public UsCrime() {
          year = "NA";
          population = "NA";
          violentCrime = "NA";
          violentCrimeRate = "NA";
          murder = "NA";
          murderRate = "NA";
          rape = "NA";
          rapeRate = "NA";
          robbery = "NA";
          robberyRate = "NA";
          assault = "NA";
          assaultRate = "NA";
          property = "NA";
          propertyRate = "NA";
          burglary = "NA";
          burglaryRate = "NA";
          larceny = "NA";
          larcenyRate = "NA";
          vehicle = "NA";
          vehicleRate = "NA";
          }

        //Getter Methods

        //Gets the year
        public String getYear() {
          return year;
        }

        //Gets the population coujt
        public String getPopulation() {
          return population;
        }

        //Gets the violent crime count
        public String violentCrime() {
          return violentCrime;
        }

        //Gets the the violent crime rate
        public String getViolentCrimeRate() {
          return violentCrimeRate;
        }

        //Gets the murder count
        public String getMurder() {
          return murder;
        }

        //Gets the murder rate
        public String getMurderRate() {
          return murderRate;
        }

        //Get the rape count
        public String getRape() {
          return rape;
        }

        //Gets the rape rate
        public String getRapeRate() {
          return rapeRate;
        }

        //Gets the robbery count
        public String getRobbery() {
          return robbery;
        }

        //Gets the robbery rate
        public String getRobberyRate() {
          return robberyRate;
        }

        //Gets the property damage count
        public String getProperty() {
          return property;
        }

        //Gets the property damage rate
        public String getPropertyRate() {
          return propertyRate;
        }

        //Get the burglary count
        public String getBurglary() {
          return burglary;
        }

        //Gets the burglary rate
        public String getBurglaryRate() {
          return burglaryRate;
        }

        //Gets the larceny count
        public String getLarceny() {
          return larceny;
        }

        //Gets the larceny rate
        public String getLarcenyRate() {
          return larcenyRate;
        }

        //Get the vehicle count
        public String getVehicle() {
          return vehicle;
        }

        //Gets the vehicle rate
        public String getVehicleRate() {
          return vehicleRate;
        }
}
