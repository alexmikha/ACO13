package main.java.week6;

import java.io.File;
import java.io.IOException;

/**
 * Created by mykhailov on 02.07.16.
 */
public class FileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("dir1");

        deleteFile(file.getAbsolutePath());

    }

    private static void deleteFile(String path) {
        File file = new File(path);

        if(file.isFile()){
            file.delete();
        } else {
            File[] files = file.listFiles();

            for (File file1 : files) {
                deleteFile(file1.getAbsolutePath());
            }
            file.delete();
        }

    }
}
