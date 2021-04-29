public class Customer{
  private String name;
  private boolean child, student, booked;
  
  /*Constructor*/
  public Customer(String nameIn, int age, boolean studentIn){
    name = nameIn;
    child = (age > 5 && age < 16);
    student = studentIn;
  }//end constructor
  
  /*gets name method*/
  public String getName(){
    return name;
  }//end method
  
  /*isChild method*/
  public boolean isChild(){
    return child;
  }//end method
  
  /*isStudent method*/
  public boolean isStudent(){
    return student;
  }//end method
  
  /*isBooked method */
  public boolean isBooked(){
    return booked;
  }//end method
  
  /*setBooked method*/
  public void setBooked(boolean booked){
    this.booked = booked;
  }//end method
}//end class