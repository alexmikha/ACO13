package main.java.week6;

import java.io.*;

/**
 * Created by mykhailov on 02.07.16.
 */
public class IOReadrWriter {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(
                new FileInputStream("week2.txt"));


        /*int readByte;
        while ((readByte = is.read()) != -1){
            System.out.print((char) readByte);
        }*/


        Reader reader = new BufferedReader(
                new FileReader("week2.txt"));


        int readChar;
        while ((readChar = reader.read()) != -1){
            System.out.print(readChar + " ");
        }



    }
}
