package WeekTwo;

public class Loops {

    public static void main(String[] args) {
        
        int arr[] = {11,12,3,4,5,6};
        //For loop - when u know the limit
        for(int i = 1; i<=10; i++){
            System.out.println("Loop Count " );
        }

        
        //For each only for arrays lists etccc....
        for (int i : arr) {
            System.out.println(i);
        }

        //While ( Only condition) - when u dont know the limit
        int x = 0;  //starting
        while(x<=50){
            System.out.println(x);
            x = x+5; // x+=5;
            if(x==25){
                continue;
            }
        }//ending when x = 50

        //55
        do {
            System.out.println(x);
            x+=5;
        } while (x<=50);


    }
    
}
