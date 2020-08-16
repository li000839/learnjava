import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class testWriteFile {

    public static void main(String[] args) {

        try (PrintWriter pw =
                     new PrintWriter(new FileWriter("test.txt"))) {

            pw.println("Hello World");
            pw.format("My least favourite device is %s and its price is $%d",
                    "iPhone", 100000);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}