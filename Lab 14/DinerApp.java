import javax.swing.*;
import java.awt.*;

public class DinerApp{
  public void main(String[] args){
    JFrame frame = new JFrame("Diner"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TablePanel table = new TablePanel();
    frame.getContentPane().add(table);
    frame.pack();
    frame.setVisible(true);
  }
}