package shapes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;
/*
 * 
 * Ben Stacey, Lab 21, Shape class
 * 
 */
public class ShapePanel extends JPanel{
  private JPanel controlPanel;//control panel
  private JTextField showNum = new JTextField(2);//number text field
  private JLabel countLabel;//count label
  private DrawingPanel drawPanel;//drawing panel
  private Shape[] shapes = new Shape[20];//shape
  private int count;//count
  private Timer timer;//timer
  private final int DELAY = 20;//delay
  private JButton [] buttons = new JButton [7];//creates an array to hold JButton references
  
  /* ShapePanel constructor */
  public ShapePanel(){
    DrawingPanel drawingPanel = new DrawingPanel();//creates drawing panel
    controlPanel = new JPanel();//creates the contro; panel
    countLabel = new JLabel("Count");//creates count intance
    ButtonListener listener = new ButtonListener();//creates button listener
    
    controlPanel.setPreferredSize(new Dimension(100,400));//sets the size of the control pane
    controlPanel.add(countLabel);//adds count to the control panel
    controlPanel.add(showNum);//adds num to the control panel
    
    add(controlPanel);//adds control panel
    add(drawingPanel);//adds drawing panel
    
    timer = new Timer(DELAY,listener);//creates timer instance
    
    buttons[0] = new JButton("Start");
    buttons[1] = new JButton("Stop");
    buttons[2] = new JButton("Circle");
    buttons[3] = new JButton("Square");
    buttons[4] = new JButton("Oval");
    buttons[5] = new JButton("Smiley");
    buttons[6] = new JButton("Swirl");
    
    for(JButton button:buttons){
      controlPanel.add(button);
      button.addActionListener(listener);
    }
  }//end constructor
  
  /* private inner drawing class*/
  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setBackground(Color.gray);//sets colour of drawing panel
      setPreferredSize(new Dimension(400,400));//sets size of drawing panel
    }//end method
    
    /* paint component method */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      if(count > 0){
        for(int i = 0; i < count; i++){
          shapes[i].display(g); 
        }
      }
    }//end method
  }//end inner class
  
  /* private inner button listener class*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == buttons[1]){//adds a circle everytime the button is pressed
            timer.stop();
          }//end if
          else if(e.getSource() == buttons[0]){//adds a swirl everytime the button is pressed
            timer.start();
          }//end else if
      if(count < 21){
        //JButton button = (JButton) e.getSource();
        if(e.getSource() == timer){
          for(int i = 0; i < count; i++){
            shapes[i].move(); 
          }
        }
        else{
          if(e.getSource() == buttons[2]){//adds a square everytime the button is pressed
            shapes[count] = new Circle();
            count++;
            showNum.setText("" + count);
          }//end else if
          else if(e.getSource() == buttons[3]){//adds a smiley everytime the button is pressed
            shapes[count] = new Square();
            count++;
            showNum.setText("" + count);
          }//end else if
          else if(e.getSource() == buttons[4]){//adds a Oval everytime the button is pressed
            shapes[count] = new Oval();
            count++;
            showNum.setText("" + count);
          }//end else if
          else if(e.getSource() == buttons[5]){//adds a Oval everytime the button is pressed
            shapes[count] = new Smiley();
            count++;
            showNum.setText("" + count);
          }//end else if
          else if(e.getSource() == buttons[6]){//adds a Oval everytime the button is pressed
            shapes[count] = new Swirl();
            count++;
            showNum.setText("" + count);
          }//end else if
        }//end else
        //refreshes the pages for every selction of the buttons
      }
      repaint();
    }//end method
  }//end inner class
}//end class