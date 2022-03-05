package WeekOne.FirstProgram;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in); // in  is for input

        //1. rules for variable no number in starting caps, small, number at end

        byte b = 127;
        short s = 1011;
        int x = 1234124245;
        long lg = 132421354235435L;
        char ch = '?';
        float f = 1232.023523439f;
        double d = 1243234.2435245324534;

        long c = x;//Widening Casting 
        int xx = 13; //Narrowing Casting

        char chh = (char) xx;


        boolean bol = false;

        System.out.println(bol); //out is for output
        System.out.print("My age is " + x);
        System.out.print("\nJust printing second"); //\n next line
        System.out.print("\nJust\tPrint\n"); //tab -\t 4 space
        System.out.println("My Name is \"Bala\""); // \"
        System.out.println("D:\\Java\\"); // 
        System.out.println("My name is " + b + " And my name is bala");
        //System.out.printf(format, args) 
        System.out.printf("My name is %d and my name is %s \n Float %f\n", x, "Bala", f); //printf formating
        

        char abb = 'h';
        int chaa = abb;

        int var = 35;
        char g = (char) var;
        System.out.println(g);

    }
}

//javac HelloWorld - compile
//java just filename
