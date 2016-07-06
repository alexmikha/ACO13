package main.java.homeWork.library;

import java.io.*;
import java.util.List;

/**
 * Created by mykhailov on 03.07.2016.
 */

public class SerialisationLibrary {

    public void saveIssueReaderToFile(List list, String file) {

        File issueFile = new File( file );
        try {
            OutputStream fos = new FileOutputStream( issueFile );
            ObjectOutputStream oos = new ObjectOutputStream( new BufferedOutputStream( fos ) );
            oos.writeObject( list );
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println( e );
        }
    }
}

