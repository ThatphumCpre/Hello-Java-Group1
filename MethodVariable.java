public class MethodVariable {
      public static void main(String[] args) {
          int sum = plusMethod(1, 2);  //collect in sum as Intreger
          System.out.println(sum);     //output : Int Type Method
          System.out.println(plusMethod(1.2, 6.2)); //output : double type method
      }
      static int plusMethod(int x, int y){
          System.out.println("Int Type method");
          return x+y;
      }
      static double plusMethod(double x, double y){
          System.out.println("Double Type method");
          return x+y;
      }

}
