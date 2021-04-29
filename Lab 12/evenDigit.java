import java.util.Scanner;

public class evenDigit{
  public static void main(String[]args){
    int count = 0;
    int sum = 0;
    
    System.out.println("Enter an integer greater than 1");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    if(num > 2){
      while(count > num){
        if(count > 3 && count % 2 == 0){
          sum += count;
        }
        count++;
      }
      System.out.print("Sum of the even numbers between 2 and " + num + " is: " + sum);
    }
    else{
      System.out.println("Enter a number above 2");
    }
  }
}
