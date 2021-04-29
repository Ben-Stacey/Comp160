import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
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
  private DrawingPanel drawingPanel;//drawing panel
  private Shape[] shapes = new Shape[20];//shape
  private int count;//count
  
  /* ShapePanel constructor */
  public ShapePanel(){
    controlPanel = new JPanel();//creates the contro; panel
    controlPanel.setPreferredSize(new Dimension(100,400));//sets the size of the control panel
    
    drawingPanel = new DrawingPanel();//creates drawing panel
    
    addShape = new JButton("Add Shape");//creates add shape instance
    countLabel = new JLabel("Count");//creates count intance
    
    controlPanel.add(addShape);//adds shape to the control panel
    controlPanel.add(countLabel);//adds count to the control panel
    controlPanel.add(showNum);//adds num to the control panel
    
    ButtonListener listener = new ButtonListener();//creates button listener
    addShape.addActionListener(listener);//adds shape to button listener
    
    add(controlPanel);//adds drawing panel
    add(drawingPanel);//adds control panel
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
      if((e.getSource() == addShape) && (count < 20)){//adds a shape everytime the button is pressed
        shapes[count] = new Shape();
        count++;
        showNum.setText("" + count);
      }//end if
      repaint();
    }//end method
  }//end inner class
}//end class