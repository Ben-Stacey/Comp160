public class Diner{
  public  maximum(){
    int x = 3;
      int y = 1;
      int z = 2;
    if(x == y || y == z || z == x){
      System.out.println(0);
    }
    else if(x > y && x > z){
      System.out.println(x);
    }
    else if(y > x && y > z){
      System.out.println(y);
    }
    else{
      System.out.println(z);
    }
  }
}
