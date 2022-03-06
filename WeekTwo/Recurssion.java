package WeekTwo;

public class Recurssion {

    public static int fac1(int n) { // 1
        if (n <= 0) return 1; 
        else {
            System.out.println(n);
            return fac1(n-1)  * n;
        } //
    }
    
    public static String reverseString(String str){ // very very important *****
        if(str.isEmpty()){

            return str;
        }

        else{

            System.out.println(str);
            return reverseString(str.substring(1)) + str.charAt(0);
            
        }
    }    

    public static void main(String[] args) {
        
        int x = 5;
        String s = "Bala";
        System.out.println(reverseString(s));
        
    }
    
}
