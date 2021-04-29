public class Triangle{
  private int p1x, p1y, p2x, p2y, p3x, p3y;
  private String name;
  
  public Triangle(){
  this.p1x = 0;
  this.p1y = 0;
  this.p2x = 3;
  this.p2x = 0;
  this.p2x = 3;
  this.p3y = 4;
  this.name = "Test";
  }
  
  public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    this.p1x = pt1x;
    this.p1y = pt1y;
    this.p2x = pt2x;
    this.p2y = pt2y;
    this.p3x = pt3x;
    this.p3y = pt3y;
    this.name = nameIn;
  }
  
  public double calcSide(int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
  }
  
  public double getPerimeter(){
    return calcSide(p1x+p1y+p2x+p2y) + calcSide(p2x+p2y+p3x+p3y) + calcSide(p1x+p1y+p3x+p3y);
  }
  
  public String getName(){
    return name;
  }
}