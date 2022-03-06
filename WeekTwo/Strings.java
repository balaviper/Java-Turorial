package WeekTwo;

public class Strings {

    public static void main(String[] args) {
       //********* Strings ********************

        String name = "Balaaaaaaaaaaa";
        System.out.println(name.charAt(1)); //accesing by index no
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,7)); // substring
        System.out.println(name.equals("Bala")); //

        String n1 = "KAALA";
        String n2 = "kaala";
        System.out.println(n1.equalsIgnoreCase(n2));

        n1 = n1.concat(n2); //joining two string
        System.out.println(n1.length());
    
        //*********String Buffer ********************

        StringBuffer sb = new StringBuffer();

        sb.append("BalaAAAAAAAAAAAAAAA");
        sb.append("BalaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("String "+ sb);
        System.out.println("String "+ sb.capacity()); //(oldcap *2) +2
        sb.replace(1, 7, "BBBBBb");
        sb.insert(9, "Z");

        //********String Builder***********/
    }
    
}
