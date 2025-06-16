import java.util.*;

class Q10 {
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      int n, x;
      System.out.println("Enter n");
      n = sc.nextInt();
      System.out.println("Enter x");
      x = sc.nextInt();
      
      double sum = 1;
      
      for(int i=1; i<= n; i++){
          sum = sum + Math.pow(x, i);

      }
        System.out.println("Sum of the series 1+x+x^2+x^3+...+n is " + sum);
      
    }
}
