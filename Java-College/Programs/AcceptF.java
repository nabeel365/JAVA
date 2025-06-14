import java.io.*;
class AcceptF{

public static void main(String args[])throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a float value: ");
float num = Float.parseFloat(br.readLine());
System.out.println("You entered: "+num);

}
}