package Day_two;

public class Conditional {
    public static void main(String[] args) {
        
        int x = 10;
        //           0 1 2 3 4 5
        int arr[] = {1,2,3,4,5,7}; // direct init
        
        int arr1[] = new int[5]; // declaration

        arr1[0] = 11;
        arr1[1] = 12;
        arr1[4] = 15; //init

        System.out.println("Before");
        for (int i : arr) {
            System.out.println(i);
        }
        arr[0] = 14;
        System.out.println("After");
        for (int i : arr) {
            System.out.println(i);
        }

        //Strings
        char[] ch={'j','a','v','a'};

        String address = "sdfhbsdfij sudfbsidjfbih iusdbfisbdf";
        String s = new String(ch);

        String n1 = "Naveena";
        System.out.println(n1.length());
        n1 = "Bala";
        System.out.println(n1.length());


        // Task 1 : 
        //Arithmatic operator: 
        // A train starts from A and stops at B. Speed of the train is 130km/hr.
        //In between stops between a and b is 5, and train stops 2 min in every stop.
        //Distance between A and B is 780km. How much time it takes to reach B from A.
        
        //Task 2 :
        // Calculate Compound Intrest : 






       
    }
    
}
