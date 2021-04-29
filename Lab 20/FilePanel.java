import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
/** FilePanel.java
  * Lab 20, COMP160,  2020
  *
  * a JPanel which creates 2 instances of Rectangle objects,
  * stores them in an array, and draws them
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count, x, y, width, fill, height, c;
  private Color colour;
  private boolean b = false;
  /**constructor instantiates Rectangle objects and
    * stores references to them in the array
    */
  public FilePanel(){
    count = 0;
    String fileName = "Lab20Data.txt";
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      while(fileScan.hasNextLine() && count < drawObjects.length){
        String inputLine = fileScan.nextLine();
        if(inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){
          Scanner scan = new Scanner(inputLine);
          fill = scan.nextInt();
          if(fill == 1){
            b = true;
          }
          else if(fill == 0){
            b = false;
          }
          c = scan.nextInt();
          colour = Color.black;
          if(c == 1){
            colour = Color.red;
          }
          else if(c == 2){
            colour = Color.blue;
          }
          else if(c == 3){
            colour = Color.green;
          }
          x = scan.nextInt();
          y = scan.nextInt();
          width = scan.nextInt();
          height = scan.nextInt();
          
          drawObjects[count] = new Rectangle(b,colour, x, y, width, height);
          count++;
        }
      }
    }
    catch(FileNotFoundException e){
      System.out.println("file not found. Check file name and location.");
      System.exit(1);
    }
  }
  
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    }
  }
}