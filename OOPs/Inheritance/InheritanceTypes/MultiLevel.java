package OOPs.Inheritance.InheritanceTypes;


class Parent1{
    int x = 1000;

}
class Parent2 extends Parent1{
    int y = super.x + 100;

}
public class MultiLevel extends Parent2 {
    int z = super.y +100;
    
}
