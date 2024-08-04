//Yuanbo Pang CIS 35A
// Description: This program decrypts a file that was encrypted by adding 5 to each byte.
// It reads bytes from an encrypted input file, subtracts 5 from each byte, and writes the result to a specified output file.
import java.util.Scanner;
import java.io.*;

public class Exercise17_15 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Prompt user for the encrypted input file
        System.out.print("Enter the encrypted file: ");
        String inputFile = input.next();

        // Prompt user for the output file to save the decrypted content
        System.out.print("Enter the output file: ");
        String outputFile = input.next();

        // Try-with-resources to ensure files are closed properly
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(inputFile)));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(outputFile)))
        ) {
            int value;
            while ((value = in.read()) != -1) {
                out.write(value - 5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        input.close();
    }
}
/*
Example Outputs:

1. Encrypted value: 110 (which corresponds to 'e' + 5)
   Decrypted value: 105 (which corresponds to 'e')

2. Encrypted value: 120 (which corresponds to 't' + 5)
   Decrypted value: 115 (which corresponds to 't')
//*/
//Self-evaluation:
//Can your program read byte from the file? Yes.
//Can your program subtract 5 from each byte? Yes.
//Can your program write the new byte to the output file? Yes.
//Did your program close the files? Yes, using try-with-resources ensures that the files are closed properly.