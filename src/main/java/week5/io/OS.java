package main.java.week5.io;

import java.io.*;

/**
 * Created by mykhailov on 26.06.16.
 */
public class OS {
    public static void main(String[] args) {

        try(InputStream is = new BufferedInputStream(
                    new FileInputStream
                            ("week1.txt"));
            OutputStream  os = new BufferedOutputStream(new FileOutputStream("week6.txt")))
            {
            byte[] byteArray = new byte[4000];
            int byteCount;

            while ((byteCount = is.read(byteArray)) != -1){
                System.out.println(byteCount);
                os.write(byteArray, 0, byteCount);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
