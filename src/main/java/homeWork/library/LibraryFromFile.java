package main.java.homeWork.library;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mykhailov on 06.07.2016.
 */

public class LibraryFromFile {


    public void showLibraryFromFile(String file) {

        ArrayList arraylist;
        try {
            FileInputStream fis = new FileInputStream( file );
            ObjectInputStream ois = new ObjectInputStream( fis );
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            System.out.println( e );
            return;
        } catch (ClassNotFoundException c) {
            System.out.println( "Class not found" );
            c.printStackTrace();
            return;
        }
        for (Object tmp : arraylist) {
            System.out.println( tmp.toString() );
        }
    }
}
