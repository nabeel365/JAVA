import java.io.*;
class AcceptInt{

public static void main(String args[])throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a int: ");
int num = Integer.parseInt(br.readLine());
System.out.println("You entered: "+num);

}
}