package Part_5_1;
import java.io.*;
import java.util.*;

// Using File Output Stream
public class UsingFileOutputStream {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String name = sc.nextLine();              //variable name to store the file name
            FileOutputStream f = new FileOutputStream(name, true);  // true for append mode
            System.out.print("Enter file content: ");
            String str = sc.nextLine() + "\n";      //str stores the string which we have entered
            byte[] b = str.getBytes();       //converts string into bytes
            f.write(b);           //writes bytes into file
            f.close();            //close the file
            System.out.println("file saved.");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
