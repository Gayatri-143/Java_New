import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileAnalyzer {
    public static void main(String[] args) {
        String filePath = "sample_2.txt"; 

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Check each character
                for (char c : line.toCharArray()) {
                    c = Character.toLowerCase(c);
                    if ("aeiou".indexOf(c) != -1) {
                        vowelCount++;
                    }
                    if (c == 'a') {
                        aCount++;
                    }
                }
            }

            // Output results
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Number of times 'a' appears: " + aCount);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
