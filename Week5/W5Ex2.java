import java.io.FileReader;
import java.io.IOException;

public class W5Ex2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("dolphin.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
                System.out.println("dfsdfsdf");

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("NO files found");
        }
    }
}
