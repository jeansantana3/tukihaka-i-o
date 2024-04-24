import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        try {
            // el fabrizyo
            PrintWriter writer = new PrintWriter(file1);
            writer.println("This is the content of file1");
            writer.close();

            Scanner scanner = new Scanner(file1);
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
            scanner.close();

            System.out.println("Content of file1: " + content);

            if (file2.exists()) {
                System.out.println("file2 exists");
                if (!file2.delete()) {
                    System.out.println("Could not delete file2");
                }
            } else {
                System.out.println("file2 does not exist");
            }


            if (file1.exists()) {
                System.out.println("file1 exists");
            } else {
                System.out.println("file1 does not exist");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


