public class IntCounter{
  private int[] numArray;
/*
 * IntCounter class displays each member of the array and checks if target integer is reach
 */
  public IntCounter(int[] numArray){
    this.numArray = numArray; //sets the value of the data field
    for(int member:numArray){  //for each loop checking through the array
      System.out.print(member + " "); //prints out each member of the array
    }//end for each loop
    System.out.println(); //makes a space inbetween
  }//end method
  
  public void showTarget(int target){
    for(int i = 0; i < numArray.length;i++){ //loops through the array
      if(target == numArray[i]){ //checks the value 
        System.out.println("There is a " + target + " in position " + i);//if true prints out its position
      }//end if statement
    }//end for loop
  }//end method
}//end class