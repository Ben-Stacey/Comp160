import java.util.Scanner;

public class GuessAnimal{
  static String[] animalGuessList = new String[3];
  public static void main(String[]args){
    String[] animalLongList = {"aadvark", "ant", "beaver", "Cheetah", "dingo", "elephant", "giraffe", "hippopotamus", "iguana", "Jaguar", "Lion","monkey"};
    for(int j = 0; j < 4; j++){
      System.out.println("Please enter a number between 0 and 11: ");
      Scanner scan = new Scanner(System.in);
      int i = scan.nextInt();
      
      for (int i = 0; i < animalGuessList.length; i++){
        System.out.println( animalGuessList[i]);
        animalGuessList[i] = ;
      }
      
      for (int i = 0; i < animalLongList.length; i++){ 
        System.out.println( i + " " + animalLongList[i]);
      }
    }
  }
}
