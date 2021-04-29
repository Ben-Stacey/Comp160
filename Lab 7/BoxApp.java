public class BoxApp{
  public static void main(String[]args){
    Box.setOwner("Anna Austin");
    
    Box box1 = new Box();//box 1
    box1.setHeight(4);
    box1.setWidth(6);
    box1.setLength(4);
    System.out.println(box1.toString());
    
    Box box2 = new Box(3,4,5);//box 2
    System.out.println(box2.toString());
    
    Box box3 = new Box(5);// box 3
    System.out.println(box3.toString());
    
    Box box4 = new Box(7);//bocx 4
    System.out.println(box4.toString());
    
    Box.setOwner("Bob Berry");
  }//end method
}//end class