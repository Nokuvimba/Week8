package ie.atu;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String fileName = "File13.txt";
        File myFile = new File(fileName);

        try{
            if(myFile.createNewFile()) {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }

        }catch(IOException e){
            System.out.println("An error occurred while created the file. ");
            e.printStackTrace();
        }

    }

}