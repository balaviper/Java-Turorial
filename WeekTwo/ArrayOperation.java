package WeekTwo;

public class ArrayOperation {

    public static int[] reverse(int[] arr){
        int start = 0; //starting index
        int end = arr.length - 1; //last index

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; //3
            end--; //2
        }

        return arr;
    }


    public static void main(String[] args) {
         
        int arr1[] = {4,6,2,1,4,8}; // array is is always fixed size 
        arr1 = reverse(arr1);
        for (int i : arr1) {
            System.out.println(i);
        }
    
    }
    
}
