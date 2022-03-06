package WeekOne.WeekTask;

import java.util.Scanner;

public class Task1 {

    public double compountIntrest(double p, double r, double t){ //return some double value to main 
        return p * (Math.pow((1 + r / 100), t));    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //For scanning Input
        Task1 t1 = new Task1();
        
        System.out.println("Enter the initial principal balance:");
        double principle = sc.nextDouble();
        System.out.println("Enter the interest rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period:");
        double time = sc.nextDouble(); // getting all required data

        double CI = t1.compountIntrest(principle, rate, time);//Math.pow(base, power)

        System.out.printf("Final Amount : %.2f", CI);
        sc.close(); // not compulsory to close the scanner for small programs but its a good practice.

    }
    
}
