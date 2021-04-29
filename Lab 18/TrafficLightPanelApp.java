import javax.swing.*;
import java.awt.*;

public class TrafficLightPanelApp{
  public static void main(String[]args){
    JFrame frame = new JFrame("Traffic Light Panel");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TrafficLightPanel light = new TrafficLightPanel();
    frame.getContentPane().add(light);
    frame.pack();
    frame.setVisible(true);
  }
}