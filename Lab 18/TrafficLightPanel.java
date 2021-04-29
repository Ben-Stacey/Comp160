import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TrafficLightPanel extends JPanel{
  private JButton redButton;
  private JButton greenButton;
  private JButton amberButton;
  private JLabel lastPressedLabel;
  private JPanel buttonPanel;
  
  public TrafficLightPanel(){
    redButton = new JButton("Red");
    greenButton = new JButton("Green");
    amberButton = new JButton("Amber");
    lastPressedLabel = new JLabel("lastPressedLabel");
    buttonPanel = new JPanel();
    
    setPreferredSize(new Dimension(200,300));
    setBackground(Color.blue);
    add(buttonPanel);
    
    buttonPanel.setPreferredSize(new Dimension(80,290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(redButton);
    buttonPanel.add(greenButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(lastPressedLabel);
    
    ButtonListener listener = new ButtonListener();
    redButton.addActionListener(listener);
    greenButton.addActionListener(listener);
    amberButton.addActionListener(listener);
    
    LightPanel light = new LightPanel();
    add(light);
  }
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if(event.getSource() == redButton){
        buttonPanel.setBackground(Color.red);
        lastPressedLabel.setText("Red");
      }
      else if(event.getSource() == greenButton){
        buttonPanel.setBackground(Color.green);
        lastPressedLabel.setText("Green");
      }
      else if(event.getSource() == amberButton){
        buttonPanel.setBackground(Color.orange);
        lastPressedLabel.setText("Amber");
      }
      repaint();
    }
  }
  
  private class LightPanel extends JPanel{
    public LightPanel(){
      setPreferredSize(new Dimension(80,290));
      setBackground(Color.cyan);
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      g.fillOval(20, 30, 40, 40);
      g.fillOval(20, 80, 40, 40);
      g.fillOval(20, 130, 40, 40);
      
      if(lastPressedLabel.getText() == "Red"){
        g.setColor(Color.red);
        g.fillOval(20, 30, 40, 40);
      }
      else if(lastPressedLabel.getText() == "Green"){
        g.setColor(Color.green);
        g.fillOval(20, 80, 40, 40);
      }
      
      else if(lastPressedLabel.getText() == "Amber"){
        g.setColor(Color.orange);
        g.fillOval(20, 130, 40, 40);
      }
    }
  }
}


