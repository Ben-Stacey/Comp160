package shapes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;
import java.util.ArrayList;

public class ShapePanel extends JPanel{
  private JPanel controlPanel;//control panel
  private JTextField showNum;//number text field
  private JLabel removeLabel;//count label
  private DrawingPanel drawPanel;//drawing panel
  private ArrayList<Shape> shapes = new ArrayList<Shape>(); 
  private int count;//count
  private Timer timer;//timer
  private final int DELAY = 20;//delay
  private JButton circle, square, smiley, oval, swirl, start, stop , remove;
  
  /* ShapePanel constructor */
  public ShapePanel(){
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    controlPanel = new JPanel();//creates the contro; panel
    circle = new JButton("Circle");
    square = new JButton("Square");
    smiley = new JButton("Smiley");
    oval = new JButton("Oval");
    swirl = new JButton("Swirl");
    start = new JButton("Start");
    stop = new JButton("Stop");
    remove = new JButton("Remove");
    showNum = new JTextField(2);
    removeLabel = new JLabel("Remove which?");
    
    DrawingPanel drawingPanel = new DrawingPanel();//creates drawing panel
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add(showNum);//adds num to the control panel
    JButton [] buttons = {circle, square, smiley, oval, swirl, start, stop, remove};
    
    ButtonListener listener = new ButtonListener();//creates button listener
    for(int i = 0; i < buttons.length; i++){
      buttons[i].addActionListener(listener);
      controlPanel.add(buttons[i]);
    }
    
    timer = new Timer(DELAY,listener);//creates timer instance
    controlPanel.add(removeLabel);
    controlPanel.add(showNum);
    add(controlPanel);//adds control panel
    add(drawingPanel);//adds drawing panel
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
      for(Shape s: shapes){
        s.display(g);
        s.showIndex(g, shapes.indexOf(s));
      }
    }
  }
  
  /* private inner button listener class*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(count < 21){
        //JButton button = (JButton) e.getSource();
        if(e.getSource() == timer){
          for(Shape s: shapes){
            s.move(); 
          }
        }
        else{
          JButton button = (JButton) e.getSource();
          if(button.getText().equals("Circle")){
            shapes.add(new Circle());
          }//end else if
          else if(button.getText().equals("Swirl")){
            shapes.add(new Swirl());
          }//end else if
          else if(button.getText().equals("Square")){
            shapes.add(new Square());
          }//end else if
          else if(button.getText().equals("Oval")){
            shapes.add(new Oval());
          }//end else if
          else if(button.getText().equals("Smiley")){
            shapes.add(new Smiley());
          }//end else if
          else if(button.getText().equals("Start")){
            timer.start();
          }//end else if
          else if(button.getText().equals("Stop")){
            timer.stop();
          }//end else if
          else if(button.getText().equals("Remove")){
            try{
              int in = Integer.parseInt(showNum.getText());
              shapes.remove(in);
            }
            catch(NumberFormatException z){
              System.out.println("No more shapes left to remove");
            }
            catch(IndexOutOfBoundsException b){
              System.out.println("There arent anymore shapes");
            }
          }
        }//end else
        if(shapes.size() == 0){
          showNum.setText("");
        }
        else{
          showNum.setText(Integer.toString(shapes.size() - 1));
        }
        repaint();
      }
      repaint();
    }//end method
  }//end inner class
}//end class