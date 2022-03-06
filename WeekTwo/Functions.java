package WeekTwo;

import java.util.Scanner;

public class Functions {

    public int x; // instance of class

    Functions(int x){ //para const 
        System.out.println("Constructor invoked");
        this.x = x;
    }

    Functions(){
        System.out.println(" non para Constructor invoked");
    }

    public void increment(){ //call by referance is not possibe in java
        this.x++;
        int y = 40; //local varial
    }

    public static void main(String[] args) { // boss
        
        Scanner sc = new Scanner(System.in);

        Functions f = new Functions(); // ??? default constructor() ,constructor invokes automatically
        Functions f1 = new Functions(34); //

        int x = 34; // local variable
        f.increment();
        System.out.println(f.x);
    
    }

}
