import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;            
        }
        
        System.out.println("Number of characters: " + count);
    
    }
}
