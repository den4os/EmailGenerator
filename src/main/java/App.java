import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        //System.out.print("Enter the prefix of the email address (e.g., test): ");
        String prefix = args[0];

        //System.out.print("Enter the domain of the email address (e.g., gr1.com): ");
        String domain = args[1];

        //System.out.print("Enter the starting number for generation: ");
        int start = Integer.parseInt(args[2]);

        //System.out.print("Enter the number of email addresses to generate: ");
        int count = Integer.parseInt(args[3]);

        String filename = "emails.csv";

        try {
            FileWriter writer = new FileWriter(filename);

            String firstLine = "email,password\n";
            writer.write(firstLine);

            for (int i = start; i < start + count; i++) {
                String paddedIndex = String.format("%04d", i);
                String email = prefix + paddedIndex + "@" + domain;
                String line = email + ",ajbPwV\n";
                writer.write(line);
            }

            writer.close();
            System.out.println("Generation successful. File written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}