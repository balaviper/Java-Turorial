package WeekThree;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {

    public static void ThrowIng(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val<0){
            throw new ArithmeticException("Negative values cannot be accepted");
        }

    }

    public static void Exp() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of students");
            //try {
                int no = sc.nextInt();
            System.out.println("Wrrong formate of input");
            //} catch (Exception e) {
                System.out.println("Final block");
            //}
            sc.nextLine();
        //
            int value = sc.nextInt();
    }
    public static void main(String[] args) {
        
        ThrowIng();
        try {
            Exp();

            //anythong
        } catch (Exception obj) {
            
        }
        


    }
    
}
