import java.util.Scanner;

import database.DataRepository;
import model.LoginSignUp;

public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LoginSignUp ls = new LoginSignUp();
        DataRepository data = new DataRepository();

        int ch;
        do{
        System.out.println("main menu");
        System.out.println("\n1.Login \n2.Signin \n3.Exit");
        System.out.println("Enter your choice :");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                ls.performLogin();
                break;
            case 2:
                ls.performSignup();
                break;
            case 3:
                break;

            default:
             System.out.println("enter the correct choice");
            }
       
        }while(ch!=3);
    
        try {
            data.getAllData("opps_project", "user");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
