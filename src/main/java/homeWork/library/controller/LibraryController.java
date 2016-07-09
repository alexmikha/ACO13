package main.java.homeWork.library.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 03.07.2016.
 */

public class LibraryController {

    public void saveIssueReaderToFile(List list, String file) {

        File libraryFile = new File(file);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(libraryFile)));
            oos.writeObject(list);
            oos.flush();
            oos.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        if (libraryFile.getAbsoluteFile().length() > 0)
            System.out.println("File successfully written - " + libraryFile.getAbsoluteFile().getName());
        else
            System.out.println("File not found written");
    }


    public void showLibraryFromFile(String file) {

        ArrayList arraylist;
        try {
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            arraylist = (ArrayList) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println(e);
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for (Object tmp : arraylist) {
            System.out.println(tmp.toString());
        }
    }

}

