import java.io.FileReader;
import java.io.IOException;

public class backwards {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("backwards.txt");
            int data = reader.read();
            char[] characters = new char[1000];
            int i = 0;
            String quote = "";
            while (data != -1) {
                characters[i] = (char) data;
                data = reader.read();
                i++;
            }
            for (int j = i; j >= 0; j--) {
                quote += characters[j];
            }
            System.out.println(quote+ " DSF");
        } catch (IOException e) {
            System.out.print("File not found");
        }
    }
}
