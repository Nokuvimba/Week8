package ie.atu;

import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        String fileName = "File13.txt";
        try(FileWriter writer =new FileWriter(fileName)){
            writer.write("l created a file .");
            System.out.println("content successfully written\n");
        }
        catch(IOException e){
            System.out.println("An error occurred while documenting the file\n");
        }
    }
}

