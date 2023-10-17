import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sums {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("sums.txt");
            int data = reader.read();
            Scanner s = new Scanner(System.in);
            while (data != -1) {
                System.out.println((char) data);
                String line = s.nextLine();
                data = reader.read();
                
            }
        } catch (IOException e) {
            System.out.println("No file found");
        }
    }
}
