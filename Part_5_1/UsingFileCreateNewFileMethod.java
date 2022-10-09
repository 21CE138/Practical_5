package Part_5_1;
import java.io.*;

public class UsingFileCreateNewFileMethod {
    public static void main(String[] args) {
        // Using f.createNewFile() Method.
        File f = new File("E:\\Java Concept With Date\\JAVA_PRACTICAL\\music.txt");
        boolean result;
        try {
            result = f.createNewFile();
            if(result){
                System.out.println("File Created " + f.getCanonicalPath());
            }
            else{
                System.out.println("File  already exist at location : " + f.getCanonicalPath());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("File Exists : " + f.exists());
        System.out.println("File can be read: " + f.canRead());
        System.out.println("File can be write: " + f.canWrite());
        System.out.println("File can be Execute: " + f.canExecute());
        System.out.println("File name: " + f.getName());
        System.out.println("Parent of File: " + f.getParent());
        System.out.println("Path of File: " + f.getPath());
        System.out.println("Length of the File: " + f.length());
        System.out.println("Last Modified time: " + f.lastModified());
        System.out.println("It is a File: " + f.isFile());
        System.out.println(f.getPath()+" is a Directory");

    }
}
