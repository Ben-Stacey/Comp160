import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2020 
 */
public class Pie extends JPanel{
  /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
  
  
  /** all drawing code goes in the paint method, which is called automatically*/
  public void paintComponent (Graphics page){
    super.paintComponent(page);
    
    page.arcAngle(150, 150, 100, 50, 0, 45);
    //  page.arcFill(    ,45)
      //page.arcFill(    ,45)
      //page.arcFill(    ,45)
      //page.arcFill(    ,45)
      //page.arcFill(    ,45)
      //page.arcFill(    ,45)
      //page.arcFill(    ,45)
     // page.arcFill(    ,45)
      //page.arcFill(    ,45)
      //your pie chart code goes here - you MUST use local variables as described in the lab book
  }
}