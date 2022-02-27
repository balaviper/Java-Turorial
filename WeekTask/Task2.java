package WeekTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float Speed = 130.0f;
        int Station_time = 10;

        System.out.println("Enter the Distance : ");
        int Distance = sc.nextInt();

        float hour = Distance/Speed;
        float min = hour*60 % 60 + Station_time;

        System.out.printf("%.0f Hours %.0f Min", hour, min);

    }
    
}
