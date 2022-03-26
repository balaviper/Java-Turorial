package model;

import java.util.Scanner;

import database.DataRepository;
import entities.User;

public class LoginSignUp {

    DataRepository data = new DataRepository();
    private final String database = "opps_project";
    private final String tablename = "user";

    public void performLogin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.next();
        User temp = data.getUser(tablename, userName);
        if(temp==null){
            System.out.println("No user found");
        }
        else if(temp.getUsername().equals(userName) && temp.getPassword().equals(password)){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Incorrect password");
        }
    }
    
    public void performSignup(){
        User da = new User();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the username");
        String username =sc.nextLine();
        da.setUsername(username);
        System.out.println("enter the password");
        String password =sc.nextLine();
        da.setpassword(password);
        System.out.println("enter the email");
        String emailid =sc.nextLine();
        sc.close();
        da.setEmailid(emailid);
        da.setUpiAccount();
        data.addData(database, tablename, da);
    }
    // public void printUsers(){
    //     for (Data data : arrli) {
    //         System.out.println(data.getUsername());
    //     }
    // }
    
}
