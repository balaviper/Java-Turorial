package WeekTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) {
         this.obj = obj;
     } // constructor
    public T getObject() {
         return this.obj; 
        }
    
    public T increment(){

        if( this.obj instanceof Integer){
        Integer i = (Integer) this.obj;
        i++;
        T temp = (T) i;
        return temp;
        }
        else if( this.obj instanceof Double){
            Double i = (Double) this.obj;
            i++;
            T temp = (T) i;
            return temp;
        }
        else{
            return null;
        }
    }
}
public class WrapperClass {

    public static void Int(){

        Double D = 120.8;
        String num1 = "1234";
        Integer n = Integer.valueOf(num1);

    }

    public static void main(String[] args) {
        
        
    }
}