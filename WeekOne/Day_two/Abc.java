package WeekOne.Day_two;

import java.util.Scanner;
import WeekTwo.Functions;

public class Abc {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Swapping concept  
        char c ='h';
        char s = 's';
        System.out.println("Before Swapping " + c +" "+ s);
        char temp = c;
        c = s;
        s = temp;
        System.out.println("After Swapping " + c +" "+ s);

        Functions f1 = new Functions();
        f1.printing();
    }
    
}
