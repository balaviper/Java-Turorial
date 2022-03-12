package WeekThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FilesHandling {

    public void createFile(){
        try {

            File file = new File("D:\\Documents\\FileHandlingTest\\Sample.txt"); //file class
            if(file.createNewFile()){
                System.out.println("File created Successfully");
            }
            else{
                System.out.println("Already exists");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void writing()  throws Exception {
        FileWriter fw = new FileWriter("D:\\Documents\\FileHandlingTest\\Sample.txt"); //writer class
        
        fw.write("First sentence");
        fw.write("\nSecond sentence");

        fw.close();
    }


    public static void main(String[] args) throws Exception {
        
        File file = new File("D:\\Documents\\FileHandlingTest\\Sample.txt");

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }

        FileReader fr = new FileReader("D:\\Documents\\FileHandlingTest\\Sample.txt");

        int letters;

        while((letters = fr.read()) !=-1){
            System.out.print( (char) letters); 
        }

        fr.close();      
        
    }
}