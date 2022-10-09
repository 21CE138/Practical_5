package Part_5_4;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CharacterStream {
        public static void main(String[] args) throws IOException {
            BufferedReader inputStream = null;
            PrintWriter outputStream = null;
            try {
                inputStream = new BufferedReader(new FileReader("music.txt"));
                outputStream = new PrintWriter(new FileWriter("music2.txt"));

                String l;
                while ((l = inputStream.readLine()) != null) {
                    outputStream.println(l);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }
