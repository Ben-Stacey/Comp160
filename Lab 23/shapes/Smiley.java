package shapes;

import java.awt.*;

public class Smiley extends Shape{
  private int width = 30;
    private int height = 30;
  /* display method*/
  public Smiley(){
    
  }
  
  public void display(Graphics g){
    g.setColor(colour);//sets colour of the face to yellow
    g.fillOval(x,y,width,height);//creates the circle
    g.setColor(Color.black);//sets the colour of the face
    g.drawOval(x,y,width,height);//face
    g.fillOval(x + 7, y + 8, 4, 4);//left eye
    g.fillOval(x + 20, y + 8, 4, 4);//right eye
    g.drawArc(x + 8, y + 10, 15, 13, 190, 160);//smile
  }//end method
}//end class