package WeekOne.WeekTask;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[5]; //declaring array with size 5
        System.out.println("Enter the age of the Students :");
        age[0] = sc.nextInt();
        age[1] = sc.nextInt();
        age[2] = sc.nextInt();
        age[3] = sc.nextInt();
        age[4] = sc.nextInt(); //store all ages in array

        System.out.println("The third student is " + ((age[2]>=18) ? "eligible for voting." : "not eligible for voting."));
                                                    //  condition  ? if condition true : if conditon false
    
    }

    
}
