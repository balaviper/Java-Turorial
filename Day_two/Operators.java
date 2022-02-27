package Day_two;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int num1 = 200;
        // int num2 = 50;

        // System.out.println("Addition : " + (num1 + num2));
        // System.out.println("Sub : " + (num1 - num2));
        // System.out.println("Mul : " + (num1 * num2));
        // System.out.println("Divide : " + (num1 / num2));
        // System.out.println("Reminder : " + (num1 % num2));

        //Simple Intrest : simple ingtrest  = Principle * no of years * rate /100
        // System.out.println("Enter principle amount");
        // double p = sc.nextInt();
        // System.out.println("Enter no of years ");
        // int n = sc.nextInt();
        // System.out.println("Enter rate of intrest");
        // int r = sc.nextInt();

        // double simple_intrest = (p*n*r)/100;
        // System.out.println("Simple Intrest : " + simple_intrest);

        // int v1 = 34;
        // int v2 = 35;
        // System.out.println("Greater : " + (v1!=v2));

        // //Logical
        // boolean and = (v1!=v2) && (11>16);
        // boolean or = (v1==v2) || (11>16);

        // System.out.println("Logical And " + and );
        // System.out.println("Logical Or " + or );

        //Inc and Dec

        int val = 100;
        ++val;

        System.out.println(++val); // pre increment 
        System.out.println(val++); //102 post increment 
        //103


        val--;
        --val;
        System.out.println(val);


        int n1 =12;
        int n2 =14;
        int greater = (n1<n2) ? 100 : n2; //------ ? --- :----
        

        System.out.println(greater);

    }
    
}
