package main.java.homeWork.library.libraryController;

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
            OutputStream fos = new FileOutputStream(libraryFile);
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(fos));
            oos.writeObject(list);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        if (libraryFile.getAbsoluteFile().length() > 0)
            System.out.println("File successfully written - " + libraryFile.getAbsoluteFile().getName());
        else
            System.out.println("file not found written");
    }

    public void showLibraryFromFile(String file) {

        ArrayList arraylist;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(fis));
            arraylist = (ArrayList) ois.readObject();
            //   librarySer  = (Library) ois.readObject();
            ois.close();
            fis.close();
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

