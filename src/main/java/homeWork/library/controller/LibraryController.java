package main.java.homeWork.library.controller;

import main.java.homeWork.library.model.Library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 03.07.2016.
 */

public class LibraryController {

    public void saveIssueReaderToFile(List<? extends Comparable> list, String file) {
        File libraryFile = new File(file);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(libraryFile)));
            oos.writeObject(list);
            oos.flush();
            oos.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        if (libraryFile.getAbsoluteFile().isFile())
            System.out.println("File successfully written - " + libraryFile.getAbsoluteFile().getName());
        else System.out.println("File not found written");
    }


    @SuppressWarnings("unchecked")
    public void showIssueReaderFromFile(String file) {
        List<Object> librarylist;
        try {
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            librarylist = (ArrayList<Object>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println(e);
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for (Object tmp : librarylist) {
            System.out.println(tmp);
        }
    }


    public void saveLibraryToFile(Library library, String file) throws FileNotFoundException {
        File allLibraryFile = new File(file);
        try {
            try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
                oos.writeObject(library);
                oos.flush();
                oos.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        if (allLibraryFile.getAbsoluteFile().canRead())
            System.out.println("File successfully written - " + allLibraryFile.getAbsoluteFile().getName());
        else System.out.println("File not found written");
    }


    public void lookLibraryFromFile(String file) {
        Library copyLibrary;
        try {
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            copyLibrary = (Library) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println(e);
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Readers of the library:");
        copyLibrary.showReadersLibrary();

        System.out.println("Issue of the library:");
        copyLibrary.showIssueLibrary();
    }
}
