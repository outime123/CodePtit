package thread;

import java.io.*;

public class Bai2 {
    public Bai2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\ktlt\\input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        int t;
        while((t=fileInputStream.read())!=-1){
            System.out.println(t);
        }
    }
}
