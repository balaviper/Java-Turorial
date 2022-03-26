package entities;

public class User {

    private String username;
    private String emailid;
    private String password;
    private String upiAccount;
    private int walletBalance = 0; 

    public User(){

    }

    public User(String username, String emailid,String password,String upiAccount,int walletBalance){
        this.username=username;
        this.emailid = emailid;
        this.password= password;
        this.upiAccount = upiAccount;
        this.walletBalance = walletBalance;
    }

    public void setUsername(String username){
        this.username=username;
    } 
    public String getUsername(){
       return this.username;
    } 

    public void setEmailid(String emailid){
       this.emailid = emailid;
    }
    public String getEmailid(){
       return this.emailid;    
    }

    public void setpassword(String password){
       this.password= password;
    }
    public String getPassword(){
       return this.password;
    }

    public void setUpiAccount(){
        int index = emailid.indexOf("@");
        String submail = emailid.substring(0, index);
        this.upiAccount = submail.concat("@upi.com");
    }
    public String getUpiAccount() {
        return this.upiAccount;
    }

    public void setWalletBalance(int amount){
        this.walletBalance = amount;
    }
    public int getWalletbalance(){
        return this.walletBalance;    
    }    
}
