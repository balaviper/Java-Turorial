package WeekOne.WeekTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //For getting Imput

        float Speed = 130.0f;//you can also use double
        int Station_time = 5 * 2;

        System.out.println("Enter the Distance : ");
        float hour = sc.nextInt() / Speed; //calculate total time in hours
        float min = hour*60 % 60 + Station_time;//seperating the extra min except whole hour
        //eg : 7.4215.. to convert 0.4215 to min
        System.out.printf("%.0f Hours %.0f Min", hour, min);
        sc.close();
    }
    
}
