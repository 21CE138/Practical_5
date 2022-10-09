package Part_5_4;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException{

    FileInputStream in = null;
    FileOutputStream out = null;

        try {
        in = new FileInputStream("music.txt");
        out = new FileOutputStream("music2.txt");
        int c;

        while ((c = in.read()) != -1) {
            out.write(c);
        }
    } finally {
        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }
}
}
