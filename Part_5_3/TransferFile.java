package Part_5_3;
import java.io.*;
import java.util.*;

public class TransferFile {
    public static void copyData(File file1, File file2) throws Exception
    {
// create instances of FileInputStream and FileOutputStream classes for file1 and file2
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
// use try-catch-finally block to read and write bytes data into file
        try {
            int i;
// use while loop with read() method of FileInputStream class to read bytes data from file1
            while ((i = inputStream.read()) != -1) {

// use write() method of FileOutputStream class to write the byte data into file2
                outputStream.write(i);
            }
        }
// catch block to handle exceptions
        catch(Exception e) {
            System.out.println("Error Found: "+e.getMessage());
        }
// use finally to close instance of the FileInputStream and FileOutputStream classes
        finally {
            if (inputStream != null) {
// use close() method of FileInputStream class to close the stream
                inputStream.close();
            }
// use close() method of FileOutputStream class to close the stream
            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println("File Copied");
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
// get the file from which the data would be copied.
        System.out.println("Enter the name of the file from where the data would be copied :");
        String file1 = sc.nextLine();
// create instance of the File class for the source file
        File a = new File("E:\\Java Concept With Date\\JAVA_PRACTICAL\\"+file1);
// get the file in which the data would be written.
        System.out.println("Enter the name of the file from where the data would be written :");
        String file2 = sc.nextLine();
// create instance of the File class for the destination file
        File b = new File("E:\\Java Concept With Date\\JAVA_PRACTICAL\\"+file2);
        sc.close();
// method called to copy the data from file a to file b
        copyData(a, b);
    }
}
