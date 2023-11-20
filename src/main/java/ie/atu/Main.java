package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                String fileName = "File13.txt";

                try(PrintWriter writer = new PrintWriter(new FileWriter(fileName,true))){
                    writer.println("This line will be appended.");
                    writer.printf(" Append formatted content: %d %s%n", 42, "example");

                    System.out.println("Content successfully appended to the file");
                }
                catch(IOException e){
                    System.out.println("An error occurred while appending to the file.");
                    e.printStackTrace();
                }
    }
}