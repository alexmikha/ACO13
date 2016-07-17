package main.java.homeWork.library.testLibrary;

import main.java.homeWork.library.model.Library;
import main.java.homeWork.library.model.Author;
import main.java.homeWork.library.model.Book;
import main.java.homeWork.library.model.Issue;
import main.java.homeWork.library.model.Journal;
import main.java.homeWork.library.model.Reader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 21.06.2016.
 */
public class TestLibraryReader {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(new Author("Bruce Eckel"), "Java OPP", "PrintCenterUA", 2000);
        Book book2 = new Book(new Author("Joshua Bloch"), "Effective Java", "Lory Moscow", 2008);
        Journal journal = new Journal("National Geographic", "National Geographic Society", 2016, 1);
        Journal journa2 = new Journal(" Cosmopolitan", "Independent Media", 2015, 1);
        Reader reader1 = new Reader("Alex", "Kenton", "street one", "0-00-00-01",false);
        Reader reader2 = new Reader("Jack", "Fisher", "street two", "0-00-00-02",false);

        library.addIssueToLibrary(book1);
        library.addIssueToLibrary(book1);
        //library.addIssueToLibrary(book1);
        library.addIssueToLibrary(book2);
        library.addIssueToLibrary(book2);
        library.addIssueToLibrary(journal);
        library.addIssueToLibrary(journa2);

        int expected1 = 4;
        Object actual1 = library.getPrints().size();
        boolean result1 = actual1.equals(expected1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addIssueToLibrary",
                result1, expected1, actual1);

        library.addReaderToList(reader1);
        library.addReaderToList(reader2);

        int expected2 = 2;
        Object actual2 = library.getReaders().size();
        boolean result2 = actual1.equals(expected1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addReaderToList",
                result2, expected2, actual2);

        System.out.println("--------------issue before give------------");
        for (Issue issue : library.getPrints()) {
            System.out.println(issue);
        }

        System.out.println("--------------issue after give------------");
        library.giveIssueToReader(book1, reader1);
        library.giveIssueToReader(book2, reader1);
        library.giveIssueToReader(book1, reader2);
        library.giveIssueToReader(book2, reader2);
        library.giveIssueToReader(journal, reader1);
        library.giveIssueToReader(journa2, reader2);

        for (Issue issue : library.getPrints()) {
            System.out.println(issue);
        }

        System.out.println("--------------giveIssueToReader------------");
        int expected3 = 4;
        Object actual3 = library.getPrints().size();
        boolean result3 = actual3.equals(expected3);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "giveIssueToReader",
                result3, expected3, actual3);

        library.returnIssueToLibOfReader(book1, reader1);
        library.returnIssueToLibOfReader(book2, reader1);
        library.returnIssueToLibOfReader(book1, reader2);
        library.returnIssueToLibOfReader(book2, reader2);
        library.returnIssueToLibOfReader(journal, reader1);
        library.returnIssueToLibOfReader(journa2, reader2);

        int expected4 = 4;
        Object actual4 = library.getPrints().size();
        boolean result4 = actual4.equals(expected4);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "returnIssueToLibOfReader",
                result4, expected4, actual4);

        System.out.println("--------------issue after returnIssueToLibOfReader------------");
        for (Issue issue : library.getPrints()) {
            System.out.println(issue);
        }
        System.out.println("--------------Do not give > 3 issue------------");
        library.giveIssueToReader(book1, reader1);
        library.giveIssueToReader(book2, reader1);
        library.giveIssueToReader(journal, reader1);
        library.giveIssueToReader(journa2, reader1);
        library.giveIssueToReader(book1, reader1);

        int expected5 = 3;
        int actual5 = 0;
        for (Reader count : library.getReaders()) {
            if (count.getCountIssue() == 3)
                actual5 = 3;
        }
        boolean result5 = actual5 == expected5;
        System.out.printf("Do not give > 3 issue - %s, result - %s," +
                        " expected - %s, actual - %s\n", "giveIssueToReader",
                result5, expected5, actual5);

        System.out.println("--------------Reader isBlackList------------");
        library.addReaderOnBlack(reader2);
        library.giveIssueToReader(book1, reader2);

        int expected6 = 0;
        int actual6 = 0;
        for (Reader count : library.getReaders()) {
            if (count.getCountIssue() == 0)
                actual6 = 0;
        }
        System.out.printf("Reader isBlackList  - %s, result - %s," +
                        " expected - %s, actual - %s\n", "giveIssueToReader",
                true, expected6, actual6);

        System.out.println("--------------findIssueByWord OPP------------");
        List<Issue> findWord = new ArrayList<>();
        List<List> tmpfindWord = new ArrayList<>();
        findWord.add(book1);
        int expected7 = findWord.size();
        tmpfindWord.add(library.findIssueByWord("OPP"));

        int actual7 = tmpfindWord.size();
        boolean result7 = actual7 == expected7;
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "findIssueByWord",
                result7, expected7, actual7);

    }
}

