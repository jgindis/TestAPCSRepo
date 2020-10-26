public class Demo {
  public static void main(String[] args) {
    System.out.print(create2DArray(3,6,5));
  }

  public static void printLoop(int n) {
    for (int i = 1; i < n+1; i++) {
      for (int j = 1; j <= i; j++) {
         System.out.print(n-i+1);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[]arr){
      String str = "{";
      if (arr.length == 0) {
         str += "}";
         return str;
      }
      for (int i = 0; i < arr.length-1; i++) {
        str = str + String.valueOf(arr[i]) + ", ";
      }
      str = str + String.valueOf(arr[arr.length-1]) + "}";
      return str;
  }

  public static String arrayDeepToString(int[][]arr) {
    String str = "{";
    if (arr.length == 0) return (str + "}");
    for (int i = 0; i < arr.length-1; i++) {
      str += arrToString(arr[i]) + ", ";
    }
    str += arrToString(arr[arr.length-1]) + "}";
    return str;
  }

  public static int[][] create2DArray(int row, int col, int len) {
    int[][] arr = new int[row][col];
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            double rand = Math.random() * len++;
            double round = Math.floor(rand);
            int str = (int)round;
            arr[i][j] = str;
          }
        }
        return arr;
      }

  public static int[][] create2DArrayRandomized(int row, int col, int len) {
    int[][] arr = new int[row][];
    for (int i = 0; i < row; i++) {
      double randcol = Math.random() * (col + 1);
      int cols = (int) randcol;
      arr[i] = new int[cols];
        for (int j = 0; j < cols; j++) {
          double randomNum = Math.random() * len++;
          int str = (int)randomNum;
          arr[i][j] = str;
        }
      }
      return arr;
    }

}
