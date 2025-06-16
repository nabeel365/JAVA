import java.util.Scanner;

public class Q15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int a, b;
        System.out.println("Enter the numbers you want to find HCF and LCM of: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int hcf = 1;
    

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        int lcm = (a * b) / hcf;   // product of a and b = product of HCF and LCM

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    
        
       
}
}
