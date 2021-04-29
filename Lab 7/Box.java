public class Box{
  private int height, length, width; //data field declartion 
  private static String owner; //data field owner
  
  /*Constuctor*/
  public void Box(int h, int l, int w){
    length = l;
    width = w;
    height = h;
  }// end method
  
  /*Default Constructor*/
  public Box(){ }// end method
  
  /*Constuctor*/
  public Box(int side){
    length = side;
    width = side;
    height = side;
  }// end method
  
  /*Mutator for height value*/
  public void setHeight(int h){
    height = h;
  }
  
  /*Mutator for width vslue*/
  public void setWidth(int w){
    width = w;
  }// end method
  
  /*Mutator for length value*/
  public void setLength(int l){
    length = l;
  }// end method
  
  /*Accessor to get Surface Area*/
  public int getSurfaceArea(){
    return ((2*(width*length)) + (2*(length*height)) + (2*(width*height)));
  }// end method
  
  /*Accessor to get Volume*/
  public int getVolume(){
    return height * length * width; 
  }// end method
  
  /*toString method to list what each value is*/
  public String toString(){
    return ("Height is " + height) + ("Width is " + width) + ("Length is " + length) + ("Surface Area is " + getSurfaceArea()) + ("Volume is  " + getVolume() + ("Owned by " + owner));
  }// end method
  
  /*Mutator for the owner*/
  public static void setOwner(String nameIn){
    owner = nameIn;
  }// end method
  
  /*Assessor for owner value*/
  public static String getOwner(){
    return owner;
  }// end method
}//end class