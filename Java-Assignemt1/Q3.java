import java.util.Scanner;

public class H
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int perimeter= 2*(length+breadth);


       
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);



    }
}
