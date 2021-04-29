public class I{
  public static void main(String[]args){
    int[] penis = {2,1,4,0,3};
    calcRunningTotal(penis);
    
  }
  
  public static int[] calcRunningTotal(int[] input){
    int sum = 0;
    int [] result = new int[input.length];
    for(int i = 0; i < input.length; i++){
      sum += input[i];
      result[i] = sum;
    }
    return result;
  }
}

String lab = "Message: ";
String txt = "Hello!";

public MyPanel(String lab, String txt){
  txt = new JTextField(txt);
  lab = new JLabel(lab);
}

public class BoxPanel extends JPanel{
  private JTextField display = new JTextField("",5);
  private JCheckBox [] boxes= {new JCheckBox(), new JCheckBox(),
    new JCheckBox(), new JCheckBox(), new JCheckBox()
  };
  
  public BoxPanel(){
    ButtonListener button = new ButtonListener(listener);
    int i = 0;
    for(JCheckBox b: boxes){
      i++;
      b.setText("" + i);
      b = addItemListener(listener);
      add(b);
    }
    add(display);
  }
  private class TheListener implements ItemListener{
    public void itemPerformed(ItemEvent e){
      int count = 0;
      for(JCheckBox b: boxes){
        if(b.isSelected()){
          count++;
        }
      }
      if(count % 2 == 0){
        display.setText("even");
      }else{
        display.setText("odd");
      }
    }
  }
}