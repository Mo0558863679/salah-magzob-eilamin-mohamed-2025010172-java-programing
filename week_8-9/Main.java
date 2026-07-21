import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Using try-with-resources for Scanner ensures system resources are released
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===== ADD TASKS =====");

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter Task " + i + ": ");
                String task = sc.nextLine();
                tasks.add(task);
            }

            System.out.println("\n===== TASK LIST =====");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

        // Saving tasks to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.txt"))) {

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading tasks from the text file
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        try (BufferedReader reader = new BufferedReader(new FileReader("task.txt"))) {

            String line;
            int count = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}