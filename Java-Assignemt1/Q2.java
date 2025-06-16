import java.util.Scanner;

public class H
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price in Rupees");
        float amount = sc.nextFloat();
        float paisa=amount*100;
        System.out.println("Amount in Paisa is " + paisa);


    }
}
