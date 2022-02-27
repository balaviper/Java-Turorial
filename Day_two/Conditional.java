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

        







        


       
    }
    
}
