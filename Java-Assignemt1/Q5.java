import java.util.*;

class Q5{
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      float n;
      System.out.println("Enter a number");
      n = sc.nextFloat();
      
      float sum = 1;
      
      for(float i=2; i<= n; i++){
          sum=sum+(1/i);
      }
        System.out.println(sum);
      
    }
}
