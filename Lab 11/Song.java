public class Song{
  private String songLine;
  
  public Song(String sLine){
    songLine = sLine;
  }
  
  public String toString(){
    return songLine;
  }
  
  public void process(){
    System.out.println("Length is: " + songLine.length());
    System.out.println("Last characrter: " + songLine.charAt(songLine.length() - 1));
    System.out.println("Line to upper case: " + songLine.toUpperCase());
    System.out.println("Replace spaces with _: " + songLine.replace(' ', '_'));
    System.out.println("Index of the first k: " + songLine.indexOf('k'));
    
    boolean line = true;
    if(songLine != songLine){
      line = false;
    }
    
    System.out.println("Check song line is the same: " + line);
    
    if (songLine.indexOf(" ",songLine.indexOf(" ") + 1) != -1){
      int firstTwo = (songLine.indexOf(" ", songLine.indexOf(" ") + 1));
      String firstTwoWords = songLine.substring(0, firstTwo);
      System.out.println("First two words are: " + firstTwoWords);
      
      String firstLetter = songLine.substring(firstTwo + 1, firstTwo + 2);
      System.out.println("First letter of the third word: " + firstLetter);
    }
    else{
      System.out.println("First two words are: " + songLine);
      System.out.println("There is no first letter of the third word");
    }
  }
}