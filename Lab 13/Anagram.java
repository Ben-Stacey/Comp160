import java.util.Scanner;
/*
 * 
 * user enter 2 inputs and then decides if they are an anagram
 * 
 * 
 */
public class Anagram{
  public static void main(String[]args){
    String newString1 = "";
    String newString2 = "";
    
    System.out.println("Enter the first phrase:");
    Scanner scan1 = new Scanner(System.in);
    String s1 = scan1.nextLine();
    
    System.out.println("Enter the second phrase:");
    Scanner scan2 = new Scanner(System.in);
    String s2 = scan2.nextLine();
    
    for(char c = 'a'; c < 'z';c++){
      for(int i = 0; i < s1.length();i++){
        if(s1.charAt(i) == c){
          newString1 += c;
        }
      }
    }
    System.out.println(newString1 + " are the letters of " + s1 + " in order");
    
    for(char c = 'a'; c < 'z';c++){
      for(int i = 0; i < s2.length();i++){
        if(s2.charAt(i) == c){
          newString2 += c;
        }
      }
    }
    
    System.out.println(newString2 + " are the letters of " + s2 + " in order");
    
    if(newString1.equals(newString2)){
      System.out.println(s1 + " is an anagram of " + s2);
    }
    else{
      System.out.println(s1 + " is not an anagram of " + s2);
    }
  }//end method
  
}//end class
