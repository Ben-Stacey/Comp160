import javax.swing.*;
import java.awt.*;
/**
 * SnowmanPanel.java       From: Lewis, DePasquale & Chase page 971 (page 835 2nd edition)
 * 
 * Demonstrates basic drawing methods and the use of color.
 * 
 */
public class SnowmanPanel extends JPanel{
  
  
  /** constructor method, sets up the Snowman panel */
  public SnowmanPanel(){
    setPreferredSize(new Dimension(300,220));
    setBackground(Color.cyan);
  }
  
  /**  Draws a snowman.*/
  public void paint (Graphics g) {
    int top = 50;
    int bottom = 150;
    int left = 50;
    int right = 150;
    for(int i = 0;i<= 100; i +=10){
      g.drawLine(left + i, top, right - i, bottom);
      g.drawLine(left, top + i, right, bottom - i);
      g.drawOval(top, left, 100, 100);
    }
  }
}
