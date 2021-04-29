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
  private JButton addShape;//shape button
  private JTextField showNum = new JTextField(2);//number text field
  private JLabel countLabel;//count label
  private DrawingPanel drawPanel;//drawing panel
  private Shape[] shapes = new Shape[20];//shape
  private int count;//count
  private JButton start;//start
  private JButton stop;//stop
  private Timer timer;//timer
  private final int DELAY = 20;//delay
  
  /* ShapePanel constructor */
  public ShapePanel(){
    DrawingPanel drawingPanel = new DrawingPanel();//creates drawing panel
    controlPanel = new JPanel();//creates the contro; panel
    countLabel = new JLabel("Count");//creates count intance
    addShape = new JButton("Add Shape");//creates add shape instance
    start = new JButton("Start");//creates start instance
    stop = new JButton("Stop");//creates stop instance
    
    controlPanel.setPreferredSize(new Dimension(100,400));//sets the size of the control panel
    controlPanel.add(addShape); //adds shape to the control panel
    controlPanel.add(countLabel);//adds count to the control panel
    controlPanel.add(showNum);//adds num to the control panel
    controlPanel.add(start);//adds start to the control panel
    controlPanel.add(stop);//adds stop to the control panel
    
    ButtonListener listener = new ButtonListener();//creates button listener
    addShape.addActionListener(listener);//adds shape to button listener
    start.addActionListener(listener);//adds start to the button listener
    stop.addActionListener(listener);//adds stop to the button listenr
    
    add(controlPanel);//adds control panel
    add(drawingPanel);//adds drawing panel
    
    timer = new Timer(DELAY,listener);//creates timer instance
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
      if(e.getSource() == timer){
        for(int i = 0; i < count; i++){
          shapes[i].move(); 
        }
      }
      else if((e.getSource() == addShape) && (count < 20)){//adds a shape everytime the button is pressed
        shapes[count] = new Shape();
        count++;
        showNum.setText("" + count);
      }//end if
      if(e.getSource() == start){//if start is selected start timer
        timer.start();
      }
      else if(e.getSource() == stop){//if stop is selected stop timer
        timer.stop();
      }
      repaint();//refreshes the pages for every selction of the buttons
    }//end method
  }//end inner class
}//end class