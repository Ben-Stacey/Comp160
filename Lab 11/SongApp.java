public class SongApp{
  public static void main(String[]args){
    Song song1 = new Song("While my guitar gently weeps");
    song1.process();
    System.out.println(" ");
    
    Song song2 = new Song("Let it be");
    song2.process();
    System.out.println(" ");
    
    Song song3 = new Song("Penny Lane");
    song3.process();
  }
}