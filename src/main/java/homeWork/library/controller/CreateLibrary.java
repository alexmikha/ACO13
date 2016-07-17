package main.java.homeWork.library.controller;

import main.java.homeWork.library.model.*;
import main.java.homeWork.library.model.Reader;
import main.java.homeWork.library.view.MenuLibrary;

import java.io.*;

/**
 * Created by mykhailov on 03.07.2016.
 */
public class CreateLibrary {

    private File fileIssue = new File("issueLibrary.txt");
    private File fileReader = new File("readerLibrary.txt");

    private Library createLibrary = new Library();
    private MenuLibrary menuLibrary = new MenuLibrary();

    private Book book1 = new Book(new Author("Bruce Eckel"), "Java OPP", "PrintCenterUA", 2000);
    private Book book2 = new Book(new Author("Joshua Bloch"), "Effective Java", "Lory Moscow", 2008);
    private Book book3 = new Book(new Author("Joan Rowling"), "Harry Potter", "Scholastic Press", 1997);
    private Journal journal1 = new Journal("National Geographic", "National Geographic Society", 2016, 1);
    private Journal journal2 = new Journal("Cosmopolitan", "Independent Media", 2015, 1);
    private Newspaper newspaper = new Newspaper("Daily News.", "Tribune Company", 2016, 2);
    private Reader reader1 = new Reader("Alex", "Kenton", "street one", "0-00-00-01",false);
    private Reader reader2 = new Reader("Jack", "Fisher", "street two", "0-00-00-02",false);
    private Reader reader3 = new Reader("Nick", "Evans", "street three", "0-00-00-03",false);

    public CreateLibrary() {

    }

    public void buildLibrary() {
        createLibrary.addIssueToLibrary(book1);
        createLibrary.addIssueToLibrary(book1);
        createLibrary.addIssueToLibrary(book2);
        createLibrary.addIssueToLibrary(book2);
        createLibrary.addIssueToLibrary(book3);
        createLibrary.addIssueToLibrary(book3);
        createLibrary.addIssueToLibrary(book3);
        createLibrary.addIssueToLibrary(journal1);
        createLibrary.addIssueToLibrary(journal2);
        createLibrary.addIssueToLibrary(newspaper);

        createLibrary.addReaderToList(reader1);
        createLibrary.addReaderToList(reader2);
        createLibrary.addReaderToList(reader3);

        createLibrary.giveIssueToReader(book1, reader1);
        // createLibrary.giveIssueToReader(book2, reader1);
        createLibrary.giveIssueToReader(book3, reader1);
        // createLibrary.giveIssueToReader(journal, reader1);
        createLibrary.giveIssueToReader(journal1, reader2);
        // createLibrary.giveIssueToReader(book3, reader2);
        // createLibrary.giveIssueToReader(book3, reader3);
        createLibrary.giveIssueToReader(book3, reader3);
        createLibrary.addReaderOnBlack(reader1);
    }


    public void buildLibraryFromFile() {
        try {
            ObjectInputStream oisIssue = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileIssue)));
            Library.setPrints(oisIssue.readObject());
            oisIssue.close();

            ObjectInputStream oisReader = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileReader)));
            Library.setReaders(oisReader.readObject());
            oisReader.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
    }

    public void runLibrary() {
        if (fileIssue.getAbsoluteFile().isFile() && fileReader.getAbsoluteFile().isFile()) {
            buildLibraryFromFile();
        } else buildLibrary();
        try {
            menuLibrary.menu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



