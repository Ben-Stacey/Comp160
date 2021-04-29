import java.util.Scanner;

public class vowels{
  public static void main(String[]args){
    int vowelCount = 0;
    int consonantCount = 0;
    System.out.println("Enter a sentence: ");
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    for(int i = 0; i < s.length(); i++){
      switch(i){
        case 'A': 
        case 'a':
        case 'E': 
        case 'e':
        case 'I': 
        case 'i':;
        case 'O': 
        case 'o':
        case 'U': 
        case 'u':
          vowelCount++;
        break;
        default:
          consonantCount++;
      }
    }
    System.out.println("Sentence is: " + s);
    System.out.println("Vowel count: " + vowelCount);
    System.out.println("Consonant Count " + consonantCount);
  }
}
