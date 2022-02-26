package FirstProgram;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);// in  is for input

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
    }
}

//javac HelloWorld - compile
//java just filename
