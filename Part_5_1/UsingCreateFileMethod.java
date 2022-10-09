package Part_5_1;
import java.io.IOException;
import java.nio.file.*;

//Using createFile() Method
public class UsingCreateFileMethod {
    public static void main(String[] args)
    {
        Path path = Paths.get("E:\\Example\\music2.txt"); //creates Path instance
        try {
            Path p = Files.createFile(path);     //creates file at specified location
            System.out.println("File Created at Path: " + p);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
