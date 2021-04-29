public class TriangleApp{
  public static void main(String[]args){
    DecimalFormat f1 = new  DecimalFormat("0.00");
    Triangle a = new Triangle(0,0,0,3,3,4,"A");
    System.out.println("Triangle " + a.getName() + " perimeter is " + f1.format(a.getPerimeter()) + " units");
    
    Triangle b = new Triangle(0,3,3,4,1,9,"B");
    System.out.println("Triangle " + b.getName() + " perimeter is " + f1.format(b.getPerimeter()) + " units");
    
    Triangle c = new Triangle(4,2,9,4,5,7,"C");
    System.out.println("Triangle " + c.getName() + " perimeter is " + f1.format(c.getPerimeter()) + " units");
  }
}
