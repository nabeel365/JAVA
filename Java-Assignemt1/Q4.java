import java.util.*;

public class Q4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float f;
        System.out.println("Enter a temperature in Fahrenheit");
        f = sc.nextFloat();
        float c = ((f - 32)/1.8f); 
        System.err.println("Temperature in Celsius: " + c);

        
        
    }
}
