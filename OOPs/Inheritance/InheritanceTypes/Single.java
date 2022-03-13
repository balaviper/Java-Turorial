package OOPs.Inheritance.InheritanceTypes;


//Single Inheritance
class Parent{

    int value = 1000;

}


public class Single extends Parent { //child class or sub class

    Single s = new Single();
    int x = s.value;//using onject

    int y = super.value; //super refer to super class(Parent class)
    
    public static void main(String[] args) {
        
    }
    
}
