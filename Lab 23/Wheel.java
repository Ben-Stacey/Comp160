package shapes;

import java.awt.*;
/** Wheel.java
 * Lab 23, COMP160
 * draws a 2 tone wheel
 */
public abstract class Wheel extends Shape{
  Color shade;
  public Wheel(){
    int height = 29;
    int width = 29;
    int y = randomRange(0, 400 - height);
    int x = randomRange(0, 400 - width);
    Color shade = new Color(randomRange(0,255),randomRange(0,255),randomRange(0,255));
  }
 
  
  /**sets the colour and draws the shape*/
  public void display(Graphics g){  
    g.setColor(shade);  
    g.drawOval(x, y, width, height);
    g.fillArc(x,y,width,height,0,30);
    g.setColor(Color.black);
    g.fillArc(x,y,width,height,30,30);
    g.fillArc(x,y,width,height,90,30);
    g.fillArc(x,y,width,height,150,30);
    g.fillArc(x,y,width,height,210,30);
    g.fillArc(x,y,width,height,270,30);
    g.fillArc(x,y,width,height,330,30);  
    g.setColor(shade);
    g.fillArc(x,y,width,height,60,30);
    g.fillArc(x,y,width,height,120,30);
    g.fillArc(x,y,width,height,180,30);
    g.fillArc(x,y,width,height,240,30);
    g.fillArc(x,y,width,height,300,30); 
  }
}