package OOPs.Inheritance;

public class Animal { //parent class or super class

    public void walk(){

    }

    public void eat(){

    }
    
}

class Pig extends Animal { //child or sub class

        @Override
        public void walk() {
            super.walk();
        }
}

class dog extends Animal{

    @Override
    public void walk() {
        super.walk();
    }

}
