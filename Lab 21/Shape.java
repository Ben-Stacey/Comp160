import java.util.Random;
import java.awt.event.*;
import java.awt.*;
/*
 * 
 * Ben Stacey, Lab 21, Shape class
 * 
 */
public class Shape{
  private int x, y, width, height;
  private Color colour; 
  
  /* shape constructor*/
  public Shape(){
    Random generator = new Random();
    this.width = randomRange(10,30);//sets the value of width
    this.height = width;//sets the value of height
    this.x = randomRange(0,400 - width);//sets the value of x
    this.y = randomRange(0,400 - width);//sets the value of y
    this.colour = new Color(randomRange(0,255), randomRange(0,255), randomRange(0,255)); //set the colour
  }
  /* random range class*/
  public int randomRange(int lo, int hi){
    Random generator = new Random();//creates a random instance
    return generator.nextInt(hi - (lo + 1)) + lo;//finds the random integer
  }
  /* display class*/
  public void display(Graphics g){
    g.setColor(colour);//sets the colour of the circle
    g.fillOval(x,y,width,height);//creates the circle
  }
}