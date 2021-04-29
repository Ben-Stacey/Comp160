package shapes;

import java.util.Random;
import java.awt.event.*;
import java.awt.*;
/*
 * 
 * Ben Stacey, Lab 21, Shape class
 * 
 */
public class Shape{
  private int x, y, width, height, moveX, moveY;
  private Color colour; 
  
  /* shape constructor*/
  public Shape(){
    Random generator = new Random();
    this.width = randomRange(10,30);//sets the value of width
    this.height = width;//sets the value of height
    this.x = randomRange(0,400 - width);//sets the value of x
    this.y = randomRange(0,400 - width);//sets the value of y
    this.colour = new Color(randomRange(0,255), randomRange(0,255), randomRange(0,255)); //set the colour
    this.moveX = 5;//sets the move value on the x 
    this.moveY = 1;//sets the move value on the y
  }//end constructor
  
  /* random range class*/
  public int randomRange(int lo, int hi){
    Random generator = new Random();//creates a random instance
    return generator.nextInt(hi - lo + 1) + lo;//finds the random integer
  }//end method
  
  /* display class*/
  public void display(Graphics g){
    g.setColor(colour);//sets the colour of the circle
    g.fillOval(x,y,width,height);//creates the circle
  }//end method
  
  public void move(){
    x += moveX; //adds moveX to x
    y += moveY;//adds moveY to y
    if (x <= 0 || x >= 400 - width) {
      moveX = moveX * -1;
    }
    
    if (y <= 0 || y >= 400 - height) {
      moveY = moveY * -1;
    }
    
    if (width > 15) {
      y += moveY;
    } else {
      x += moveX;
    }
    
    if (x <= 0 || x >= 400 - width) {
      width = width += 1/2;
      height = width;
    } else {
      width = width -= 1/2;
      height = width;
    }
  }//end method
}//end class