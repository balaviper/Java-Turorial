package OOPs.Polymorphism;


class Car{ //super

    public void setColor(String color){ 

    }

}

class BMW extends Car implements Engine{ //sub class 1

    public void setColor(String color1 , String color2){ //overLoading - compile time
        
    }

    public void setColor(String color){ //overRiding - run time

    }

}

interface Engine{


}

class Tata extends Car implements Engine{ // sub class 2

}

public class Poly {

    public static void main(String[] args) {
        
        Tata tat = new Tata(); //tata form
        Car c = tat; //tata form changes to car
        Engine e = tat;//

    }
    
}
