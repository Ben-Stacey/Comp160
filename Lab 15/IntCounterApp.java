import java.util.Random;
import java.awt.*;
import java.util.Scanner;
/*
 * IntCounterApp makes the array, asks user for the target integer and runs the program
 */
public class IntCounterApp{
  public static void main(String[]args){
    for(int i = 0; i < 3;i++){ //loops through 3 times
      System.out.println("Enter the integer: "); // asks for the integer it wants to find
      Scanner scan = new Scanner(System.in); 
      int s = scan.nextInt();
      System.out.println(s); 
      
      int[] a = makeArray();
      System.out.println("Array of length " + a.length);//prints out length of array. For arrays dont use brackets on length
      IntCounter i1 = new IntCounter(a); //instsance of support class, passing it reference to of the array of makeArray
      i1.showTarget(s); //calls show target method of the instance, sending it the target integer
    }//end for loop
  }//end method
  
  public static int[] makeArray(){
    Random generator = new Random(); //instance of random
    int[] array = new int[generator.nextInt(10 - 5) + 5]; //makes array of random size between 5 and 10
    for(int i = 0; i < array.length; i++){ //for loop checks through the array
      array[i] =  generator.nextInt(5); //fills array with random values betwen 0 and 4
    }//end for loop
    return array; //returns array
  }//end method
}//end class

