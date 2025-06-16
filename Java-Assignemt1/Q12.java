import java.util.*;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        System.out.println("Enter coefficient of x^2: ");
        a = sc.nextInt();
        System.out.println("Enter coefficient of x: ");
        b = sc.nextInt();  
        System.out.println("Enter constant term: ");
        c = sc.nextInt();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else if (discriminant == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and the same.");
            System.out.println("Root: " + r);
        } else {
            System.out.println("Roots are imaginary.");
        }
        
        
    }
}
