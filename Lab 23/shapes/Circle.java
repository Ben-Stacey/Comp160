package shapes;

import java.awt.*;

public class Circle extends Shape{
  
  /* display method*/
  public Circle(){
    int x = 5;
    int y = 5;
    int width = 5;
    int height = 5;
  }
  
  public void display(Graphics g){
    g.setColor(colour);//sets the color of the Circle
    g.fillOval(x,y,width,height);//creates the circle
  }//end method
}//end class