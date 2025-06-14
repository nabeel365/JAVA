//Different types of data
import java.util.*;
class Scn
{

public static void main(String args[])
{
System.out.print("Enter id, name, salary");
Scanner sc = new Scanner(System.in);
int id = sc.nextInt();
String name = sc.next();
float salary = sc.nextFloat();
System.out.print("Id: " + id + ", Name: " + name + ", Salary: " + salary);
}

}