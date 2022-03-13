package OOPs.EncapsulationConcept;

public class Student {

    int rollNo;
    String name;
    String college;


    public void rank(String rank){

    }

    public static int addMoney(int money){
        return money+100;
    }


    public static void main(String[] args) {
        Student student1 = new Student();

        student1.rollNo = 1001;
        student1.name = "bala";
        student1.college = "no college";//defining state
        student1.rank("first");

        Student student2 = new Student();
        student2.rollNo = 1002; 
        student2.rank("second"); // defining behaviours

        ValuableData vd = new ValuableData();

        vd.setMoney(100000);
        System.out.println(vd.getMoney());

        int addedMoney = addMoney(vd.getMoney());
        vd.setMoney(addedMoney);
        
        System.out.println(vd.getMoney());


    }
    
}
