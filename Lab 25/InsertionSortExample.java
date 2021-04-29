import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/*
 * 
 * Ben Stacey, Lab 25, Insertion Sort Algorithim 
 * 
 */
public class InsertionSortExample { 
  private static int arr1[];
  private static int count = 0;
  private static int index = 0;
  private static ArrayList<Integer> a1 = new ArrayList<Integer>();
  
  /* main method processes arrays and prints out the result */
  public static void main(String[]args){  
    try{
      File fileName = new File("Data.txt");
      long y = fileName.length();
      Scanner fileScan = new Scanner(fileName);
      while(fileScan.hasNextLine()){
        String inputLine = fileScan.nextLine();
        Scanner scan = new Scanner(inputLine);
        while(count < y){ //reads through the line
          while(scan.hasNextInt()){
            a1.add(scan.nextInt()); //adds each element to an array
            count++; //increments count
          }//end while
        }//end while
      }//end while
      
      for(int member1:a1){
        arr1[index] = member1; //puts each item from the arraylist into the array
        index++;//increments index
      }//end for each loop
      
      //int x = arr1.size();
      System.out.println(arr1); 
    }//end try
    
    catch(FileNotFoundException e){
      System.out.println("File not found. Check file name and location."); // if theres no tile it'll say
      System.exit(1);
      e.printStackTrace();
    }//end catch
    
    insertionSort(arr1);//sorting array using insertion sort 
    
    for(int member2:arr1){    
      System.out.print(member2 + " ");  //prints out each element of the array
    }//end for each loop
  }//end main method   
  
  /* insertion sort method*/
  public static void insertionSort(int array[]) {  
    int n = array.length;  
    for (int j = 1; j < n; j++) {  
      int key = array[j];  
      int i = j-1;  
      while ( (i > -1) && ( array [i] > key ) ) {  //insertion sort algorithim that sorts the array
        array [i+1] = array [i];  
        i--;  
      }//end while loop  
      array[i+1] = key; //adds each element the array
    }//end for loop
  }//end method
}//end class


