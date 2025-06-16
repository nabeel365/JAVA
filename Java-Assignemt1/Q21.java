import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();

        
        if(str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
