public class Demo {
    public static void main(String[] args) {
      Demo(5);
    }
      public static void Demo(int n) {
      for(int i = 1; i < n; i++){
        for(int j = 0; j < i; j++){
          System.out.print(i);
        }
        System.out.println("");
      }
    }
}
