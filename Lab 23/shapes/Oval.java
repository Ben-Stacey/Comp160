package shapes;

import java.awt.*;

public class Oval extends Shape{
  
  /* display method*/
  public Oval(){
    int x = 5;
    int y = 5;
    int width = 5 ;
    int height = width * 4;
  }
  
  public void display(Graphics g){
    g.setColor(colour);//sets the color of the oval
    g.fillOval(x,y,width,height);//creates the circle
  }//end method
}//end class