import java.util.Scanner;
import java.text.DecimalFormat;
/** application class for Customer.java
  * Lab 9 COMP160
  */

public class CruiseApp{
  /*maiin method*/
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    confirmBooking(customer1);
    confirmBooking(customer2);
    confirmBooking(customer3);
    confirmBooking(customer4);
    confirmBooking(customer5);
    confirmBooking(customer6);
    confirmBooking(customer7);
    confirmBooking(customer8);
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8);
  }
  /*method for finding prices*/
  public static void confirmBooking(Customer customer){
    DecimalFormat f1 = new DecimalFormat("0.00");
    double totalPrice;
    
    double ticketPrice;
    double standardTicket = 56.0;
    double halfStandardTicket = 28.0;
    double discountTicketPrice = standardTicket * 0.8;
    
    double mealPrice;
    double standardMeal = 30.0;
    double halfMealPrice = 15.0;
    double discountMealPrice = standardMeal * 0.9;
    
    if (customer.isChild()){
      ticketPrice = halfStandardTicket;
      mealPrice = halfMealPrice;
    }
    else if(customer.isStudent()){
      ticketPrice = halfStandardTicket;
      mealPrice = discountMealPrice;
    }
    else{
      ticketPrice = discountTicketPrice;
      mealPrice = discountMealPrice;
    }
    
    totalPrice = ticketPrice + mealPrice;
    
    System.out.println(customer.getName() + " Ticket price: $" + f1.format(ticketPrice) + " Meal price: $" + f1.format(mealPrice) + " Total price: $ " + f1.format(totalPrice));
    Scanner scan = new Scanner(System.in);
    System.out.println("Confirm booking for " + customer.getName() + "(Y/N)");
    char s;
    s = scan.next().charAt(0);
    
    if(s == 'y' || s == 'Y'){
      customer.setBooked(true);
      System.out.println("Booked");
    }
    else{
      System.out.println("Not Booked");
    }
    
  }//end method
  
  /*shows if cusotmer is booked*/
  public static void showBooked(Customer customer){
    if(customer.isBooked() == true){
      System.out.println(customer.getName() + " is booked");
    }
  }//end method
}//end class