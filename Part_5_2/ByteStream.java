package Part_5_2;
import java.io.*;

public class ByteStream {
    public static void main(String args[]) throws IOException {
        //Creating FileInputStream object
        File file = new File("E:\\Example\\Byte.txt");
        FileInputStream fis = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        //Reading data from the file
        fis.read(bytes);
        //Writing data to another file
        File out = new File("E:\\Example\\CopyOfByte.txt");
        FileOutputStream outputStream = new FileOutputStream(out);
        //Writing data to the file
        outputStream.write(bytes);
        outputStream.flush();
        System.out.println("Data successfully written in the specified file");
    }
}
