public class Average{
  public static void main(String [] args){
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    double total = 0;
    int count = 0;
    String rows = "";
    for(int row = 0; row < table.length; row++){
      for(int col = 0; col < table.length; col++){
        total += table[row][col];
        count += 1;
        rows += table[row][col] + " ";
      }
      double average = total / count;
      System.out.println(rows + "Average: " + average);
      total = 0;
      count = 0;
      rows = "";
    }
  }
}