package main.java.week5.io.filesystem;

import java.io.File;

/**
 * Created by mykhailov on 26.06.16.
 */
public class FilesIntro {
    public static void main(String[] args) {
        File file = new File("toDel");

        for (File file1 : file.listFiles()) {
            file1.delete();
        }

        System.out.println(file.delete());

    }
}
