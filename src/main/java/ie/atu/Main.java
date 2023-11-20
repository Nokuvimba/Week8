package ie.atu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a file name");
        Scanner scanner = new Scanner(System.in);
         String fileName = scanner.nextLine();

try(FileReader fileReader = new FileReader(fileName);
    BufferedReader bufferedReader = new BufferedReader(fileReader)){

    String line;
    System.out.println("Contents of the file:");
    while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
    }

 }catch (IOException e) {
    System.out.println("An error occurred while reading the file.");
    e.printStackTrace();
 }

    }

}