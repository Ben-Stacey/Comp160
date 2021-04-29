package shapes;

import java.awt.*;

public class Oval extends Shape{
  
  /* display method*/
  public Oval(){
    int x = 5;
    int y = x;
    int width = x;
    int height = width;
  }
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x,y,width,height * 4);//creates the circle
  }//end method
}//end class