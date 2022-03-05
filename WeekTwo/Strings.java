package WeekTwo;

public class Strings {

    public static void main(String[] args) {
       
        String name = "Balaaaaaaaaaaa";
        System.out.println(name.charAt(1)); //accesing by index no
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,7)); // substring
        System.out.println(name.equals("Bala"));

        String n1 = "KAALA";
        String n2 = "kaala";
        System.out.println(n1.equalsIgnoreCase(n2));

        n1 = n1.concat(n2); //joining two string
        System.out.println(n1);
    

        

    }
    
}
