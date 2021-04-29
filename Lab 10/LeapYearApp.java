public class LeapYearApp{
  /*main method*/
  public static void main(String[]args){
    leapYear(2019);
    leapYear(2020);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }//end method
  
  public static void leapYear(int year){
    boolean isLeapYear = true;
    if(year % 4 != 0){
      isLeapYear = false;
    }
    
    if(year % 100 == 0 && year % 400 != 0){
      isLeapYear = false;
    }
    
    if(year < 1566){
      System.out.println(year + ": predates the Gregorian calender");
    }
    else if(isLeapYear == false){
      System.out.println(year + ": is not a leap year");
    }
    else{
      System.out.println(year + ": is a leap year");
    }
  }//end method
}//end class