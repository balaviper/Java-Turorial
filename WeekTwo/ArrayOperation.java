package WeekTwo;

import java.util.Arrays;

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

    public static int[] add_end(int[] oldarr, int newElement){
        int newArr[] = new int[oldarr.length + 1];
        for (int i = 0; i<oldarr.length; i++) {
            newArr[i] = oldarr[i];
        }
        int last = newArr.length;
        newArr[last -1] = newElement;
        return newArr;
    }

    public static int[] add_beginging(int[] oldarr, int newElement){
        int newArr[] = new int[oldarr.length + 1];
        newArr[0] = newElement;
        for (int i = 0; i<oldarr.length; i++) {
            newArr[i+1] = oldarr[i];
        }
        return newArr;
    }

    public static int[] add_inbetween(int[] oldarr, int pos, int newElement){
        int newArr[] = new int[oldarr.length + 1];

        for (int i = 0; i<newArr.length; i++) {
            if(i<pos-1){
                newArr[i] = oldarr[i];
            }
            else if(i==pos-1){
                newArr[pos-1] = newElement;
            }
            else{
                newArr[i] = oldarr[i - 1];
            }
        }
        return newArr;
    }


    public static void main(String[] args) {
         
        int arr1[] = {4,6,2,1,4,8}; // array is is always fixed size
    
        arr1 = add_inbetween(arr1,5, 60);

        Arrays.sort(arr1);
        Arrays.binarySearch(arr1 , 60);
    
        
        // arr1 = reverse(arr1);
        for (int i : arr1) {
            System.out.println(i);
        }
    
    }
    
}
