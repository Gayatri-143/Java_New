import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file name as a command-line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("File exists. Displaying contents:\n");

                // Read and display content using FileReader + BufferedReader
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }

                // Ask to append data
                System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
                String response = scanner.nextLine().trim();

                if (response.equalsIgnoreCase("Yes")) {
                    appendToFile(file, scanner);
                } else {
                    System.out.println("No changes made to the file.");
                }

            } else {
                System.out.println("File does not exist. A new file will be created.");
                appendToFile(file, scanner); // Create and write data
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void appendToFile(File file, Scanner scanner) throws IOException {
        System.out.println("Enter data to append to the file (type 'exit' on a new line to finish):");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            while (true) {
                String inputLine = scanner.nextLine();
                if (inputLine.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(inputLine);
                writer.newLine();
            }
        }

        System.out.println("Data written to file successfully.");
    }
}
