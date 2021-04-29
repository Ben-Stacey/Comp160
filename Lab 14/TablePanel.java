import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel{
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
  public TablePanel(){
    Diner diner1 = new Diner(125, 40, "Yoda", 1, Color.green);
    Diner diner2 = new Diner(185, 100, "Luke", 2, Color.green);
    Diner diner3 = new Diner(185, 175, "Han", 3, Color.green);
    Diner diner4 = new Diner(125, 235, "Daith", 4, Color.green);
    Diner diner5 = new Diner(65, 175, "Leia", 5, Color.green);
    Diner diner6 = new Diner(65, 100, "Chewy", 6, Color.green);
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.gray);
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.setColor(Color.yellow);
    g.drawRect(125,100,50,125);
  }
}