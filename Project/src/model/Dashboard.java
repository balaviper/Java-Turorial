package model;

import java.util.Scanner;

import entities.User;

public class Dashboard {

    User user;

    public Dashboard(User user){
        this.user = user;
    }

    public void displayDashboard(){
        System.out.println("Welcome "+ user.getUsername());
        Scanner sc =new Scanner(System.in);
        int ch;
        do{
        System.out.println("\n1.Add Money \n2.Send Money \n3.View Balance\n4.Sign Out");
        System.out.println("Enter your choice :");
        ch=sc.nextInt();
        switch (ch){
            case 1:
               
                break;
            case 2:
                
                break;
            case 3:
                break;

            default:
                System.out.println("enter the correct choice");
            }
       
        }while(ch!=4);
    }

    
    public void addMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount to add");
        int money = sc.nextInt();
        this.user.setWalletBalance(money);
    }

    public void sendMoney(){
        
    }

    public void viewBalance(){
        System.out.println("Your current Balance is : "+ this.user.getWalletbalance());
    }
    
}
