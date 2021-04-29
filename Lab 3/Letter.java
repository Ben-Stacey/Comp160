import java.util.Scanner;

public class Letter{
  private static int junior = 22000;    // standard pay rate for Junior employee
  private static int intermediate = 40000; // standard pay rate for Intermediate employee
  private static int senior = 75000;    // standard pay rate for Senior employee
  
  public static void main(String [] args){
    Scanner sc = new Scanner( System.in ); //Scanner Class
    System.out.println("Enter the successful applicant's name :");
    String name = sc.nextLine();
    jobOffer();
    jobOffer("Cheif Cook");
    jobOffer("Sous Chef");
    jobOffer("Captain", 1110000);
    jobOffer("Scientist", 9999, "Donald Trump"); //hard coded name
    jobOffer("Scientist", 9999, name); // this method uses the scanner class to find the name
  } // end method
  
  /** displays a job offer for Bottle Washer at $22K */
  public static void jobOffer(){
    System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $22000 per annum.");
    signature();
  } // end method
  
  /* displays job offer using jobTitle variable*/
  public static void jobOffer(String jobTitle){ 
    System.out.println("Dear applicant\nI wish to offer you the position of $" + jobTitle + ".\nThe pay rate will be $22000 per annum.");
    signature(); 
  } // end method
  
  /* displays job offer using jobTitle variable and payRate*/
   public static void jobOffer(String jobTitle, int payRate){ 
    System.out.println("Dear applicant\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be " + payRate + " per annum.");
    signature(); 
  } // end method
   
   /* displays job offer using jobTitle variable, payRate and name */
   public static void jobOffer(String jobTitle, int payRate, String name){ 
    System.out.println("Dear " + name + "\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be " + payRate + " per annum.");
    signature(); 
  } // end method
  
  /** displays signature */
  public static void signature(){
    String yours = "Yours sincerely";
    String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
    System.out.println("\n" + yours + "\n" + sign + "\n");
  }
} // end class