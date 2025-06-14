//Accept and display employee details
import java.io.*;
class Emp
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter id: ");
int id = Integer.parseInt(br.readLine());
System.out.println("Enter your Gender (M/F): ");
String genderInput = br.readLine();
char gen = genderInput.charAt(0);
System.out.print("Enter name: ");
String name = br.readLine();
System.out.print("Id: " + id + ", Gender: " + gen + ", Name: " + name);



}
}