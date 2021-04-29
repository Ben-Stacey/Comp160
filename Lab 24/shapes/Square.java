package shapes;

import java.awt.*;

public class Square extends Shape{
  
 /* display method*/
  public Square(){
    int x = 5;
    int y = 5;
    int width = 5;
    int height = 5;
  }
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillRect(x,y,width,height);//creates the circle
  }//end method 
}//end class