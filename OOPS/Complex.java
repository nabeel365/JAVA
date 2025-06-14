import java.util.*;

public class Complex {
    int real, imag;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary parts:");
        real = sc.nextInt();
        imag = sc.nextInt();
    }

    void display() {
        System.out.println("Complex number: " + real + " + " + imag + "i");
    }

    void add(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    void subtract(Complex c1, Complex c2) {
        real = c1.real - c2.real;
        imag = c1.imag - c2.imag;
    }

    void multiply(Complex c1, Complex c2) {
        real = c1.real * c2.real;
        imag = c1.imag * c2.imag;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        c1.input();
        c2.input();

        c1.display();
        c2.display();

        c3.add(c1, c2);
        System.out.println("After addition:");
        c3.display();

        c3.subtract(c1, c2);
        System.out.println("After Subtraction:");
        c3.display();

        c3.multiply(c1, c2);
        System.out.println("After Multiplication:");
        c3.display();
    } 

}
