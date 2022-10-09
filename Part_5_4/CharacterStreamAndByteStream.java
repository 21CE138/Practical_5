package Part_5_4;
import java.io.*;

public class CharacterStreamAndByteStream {
    public static void main(String[] args) {
        FileInputStream FileInput = null;
        FileOutputStream FileOutput = null;

        try {
            FileInput = new FileInputStream("music.txt");
            FileOutput = new FileOutputStream("music1.txt");

            int temp;

            while ((temp = FileInput.read()) != -1) {
                FileOutput.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (FileInput != null) {
                try {
                    FileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (FileOutput != null) {
                try {
                    FileOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

