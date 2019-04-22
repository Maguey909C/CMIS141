
import java.util.Arrays;

public class SearchDemo {
  static final int ARRAYSIZE=100;

  //Main method
  public static void main(String args[]) {
    System.out.println("Welcome to Search Demo");

  //Create array of ints
  int [] intValues = new int[ARRAYSIZE];
  //Assign random values
  for (int i=0; i<intValues.length; i++) {
  intValues[i] = (int) (Math.random() * 50);
  }
  System.out.println("******Unsorted int array");
  for (int i=0; i<intValues.length; i++){
    System.out.println(intValues[i]);
  }
  System.out.println("******************");

  //Sort the int array value
    Arrays.sort(intValues);

  System.out.println("******Sorted int array*******");
  // Print the sorted array
  for (int i=0; i<intValues.length; i++) {
  System.out.println("index is " +i+ "," + "value is " + intValues[i]);
  }
  
  int lookFor = 11;
  int arrIndex = Arrays.binarySearch(intValues, lookFor);
  System.out.println("The index with value 11 is: " + arrIndex);

  }
}
