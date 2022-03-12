package WeekThree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class WrapperClass {


    public void ArrayListImp(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);//0
        arr.add(13);//1

        arr.size();
        arr.remove(1);
    }

    public void LinkedListImp(){
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(12);//0
        arr.add(13);//1

        arr.size();
        arr.remove(1);
    }

    public void StackImp(){
        Stack<String> st = new Stack<String>();
        st.push("bala");
        st.push("string2");

        st.pop();
        String top = st.peek();
    }

    public void Queue(){
        Queue<Double> que = new LinkedList<>();
        que.add(123.9);
        que.remove();
    }

    public static void main(String[] args) {
        
        
        Integer y = 20; // wrapper class
        int x = y;// unboxing

        double dd = 123.78;
        Double wd = dd; // auto boxing

         

    }
    
}
