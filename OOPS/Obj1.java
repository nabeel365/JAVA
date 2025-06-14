import java.util.*;

public class Obj1 {

    int x, y;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y:");
        x = sc.nextInt();
        y = sc.nextInt();

    }

    void display(){
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(Obj1 ob1, Obj1 ob2){
        x = ob1.x + ob2.x;
        y = ob1.y + ob2.y;
    }

    public static void main(String[] args) {
        Obj1 ob1 = new Obj1();
        Obj1 ob2 = new Obj1();
        Obj1 ob3 = new Obj1();


        
        ob1.input(); 
        ob2.input();        
        
        ob1.display();       
        ob2.display();

        ob3.add(ob1,ob2);
        System.out.println("After addition:");
        ob3.display();


    }
}