import java.io.*;
class Accept{

public static void main(String args[])throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a char: ");
char ch = (char)br.read();
System.out.println("You entered: "+ch);

}
}