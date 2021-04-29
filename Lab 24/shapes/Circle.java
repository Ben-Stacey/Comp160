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
    g.setColor(colour);
    g.fillOval(x,y,width,height);
  }//end method
}//end class