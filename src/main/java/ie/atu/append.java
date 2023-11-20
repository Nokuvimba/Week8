package ie.atu;

import java.io.FileWriter;
import java.io.IOException;

public class append {
    public static void main(String[] args) {
        String fileName = "File13.txt";
        try(FileWriter writer =new FileWriter(fileName,true)){
            writer.write("It's based on java");
            System.out.println("content successfully written\n");
        }
        catch(IOException e){
            System.out.println("An error occurred while documenting the file\n");
        }
    }
}
