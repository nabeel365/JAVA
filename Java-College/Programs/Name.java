import java.io.*;
class Name{

public static void main(String args[])throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a name: ");
String ch = (String)br.readLine();
System.out.println("You entered: "+ch);

}
}