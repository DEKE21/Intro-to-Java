package cis255;
import java.io.IOException;

public class Normal {
    public static void main(String[] args) {
        try {
            // Read input character by character
            int inputChar;
            while ((inputChar = System.in.read()) != -1) {
                if (inputChar == ' ' || inputChar == '\t') {
                    // Replace space or tab with '='
                    System.out.print('=');
                } else if (inputChar == '\n') {
                    // Exit the loop on newline character
                    break;
                } else {
                    // Print other characters as is
                    System.out.print((char) inputChar);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}
