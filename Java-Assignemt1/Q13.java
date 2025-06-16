import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range: ");
        int n = sc.nextInt();

        System.out.println("The prime numbers in the entered range are: ");

        for(int i = 1; i<=n; i++){
            if(i%2 != 0){

               System.out.println(i);

            }
        }

    }
}
