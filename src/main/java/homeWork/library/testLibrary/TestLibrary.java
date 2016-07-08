package main.java.homeWork.library.testLibrary;

import main.java.homeWork.library.Library;
import main.java.homeWork.library.issue.book.Author;
import main.java.homeWork.library.issue.book.Book;
import main.java.homeWork.library.issue.Issue;
import main.java.homeWork.library.issue.Journal;
import main.java.homeWork.library.libraryController.LibraryController;
import main.java.homeWork.library.reader.Reader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 07.06.2016.
 */
public class TestLibrary {

    public static void main(String[] args) {

        Library library = new Library();
LibraryController libraryController = new LibraryController();
        Book book1 = new Book( new Author( "Bruce Eckel" ), "Java OPP", "PrintCenterUA", 2000 );
        Book book2 = new Book( new Author( "Joshua Bloch" ), "Effective Java", "Lory Moscow", 2008 );
        Book book3 = new Book( new Author( "Joan Rowling" ), "Harry Potter", "Scholastic Press", 1997 );
        Journal journal = new Journal( "National Geographic", "National Geographic Society", 2016, 1 );
        Journal journal1 = new Journal( " Cosmopolitan", "Independent Media", 2015, 1 );
        Reader reader1 = new Reader( "Alex", "Kenton", "street one", "0-00-00-01" );
        Reader reader2 = new Reader( "Jack", "Fisher", "street two", "0-00-00-02" );
        Reader reader3 = new Reader( "Nick", "Evans", "street three", "0-00-00-03" );
        Reader reader5 = new Reader( "Nick", "Evans", "street three", "0-00-00-03" );

        System.out.println( "---------------------addIssueToLibrary------------------" );
        library.addIssueToLibrary( book1 );
        library.addIssueToLibrary( book2 );
        library.addIssueToLibrary( book3 );
        library.addIssueToLibrary( book1 );
        library.addIssueToLibrary( book3 );
        library.addIssueToLibrary( book3 );
        library.addIssueToLibrary( journal );
        library.addIssueToLibrary( journal1 );
        // library.addIssueToLibrary(book1);
        System.out.println( "---------------------showIssueLibrary------------------" );
        library.showIssueLibrary();

        System.out.println( "---------------------addReaderToList---------------------" );
        library.addReaderToList( reader1 );
        library.addReaderToList( reader2 );
        library.addReaderToList( reader3 );
        library.addReaderToList( reader5 );
        System.out.println( "---------------------showReadersLibrary------------------" );
        library.showReadersLibrary();

        System.out.println( "---------------------giveIssueToReader >3-------------------" );
        library.giveIssueToReader( book1, reader1 );
        library.giveIssueToReader( book2, reader1 );
        library.giveIssueToReader( book3, reader1 );
        library.giveIssueToReader( journal, reader1 );
        library.giveIssueToReader( journal1, reader2 );
        library.giveIssueToReader( book3, reader2 );
        library.giveIssueToReader( book3, reader3 );
        library.giveIssueToReader( book1, reader3 );
        library.giveIssueToReader( journal, reader3 );

        System.out.println( "---------------------showIssueOfReader------------------ " );
        library.showIssueOfReader( reader1 );

        System.out.println( "---------------------showIssueAllReader-------------------" );
        library.showIssueAllReader();

        System.out.println( "---------------------showIssueLibrary------------------" );
        library.showIssueLibrary();

        System.out.println( "---------------------returnIssueToLibOfReader-------------------" );
        library.returnIssueToLibOfReader( book1, reader1 );
        library.returnIssueToLibOfReader( book2, reader1 );
        library.returnIssueToLibOfReader( book3, reader1 );
        library.returnIssueToLibOfReader( journal1, reader2 );
        library.returnIssueToLibOfReader( book3, reader2 );
        library.returnIssueToLibOfReader( book3, reader3 );
        library.returnIssueToLibOfReader( book1, reader3 );
        library.returnIssueToLibOfReader( journal, reader3 );

        System.out.println( "---------------------showIssueLibrary------------------" );
        library.showIssueLibrary();

        System.out.println( "---------------------showIssueAllReader-------------------" );
        library.showIssueAllReader();

        System.out.println( "---------------------addReaderOnBlackList - Alex,Nick----" );
        Reader reader4 = new Reader( "Alex", "Kenton", "street one", "0-00-00-01" );
        library.addReaderOnBlack( reader4 );
        //       library.addReaderOnBlack(reader1);
        library.addReaderOnBlack( reader3 );
        library.addReaderOnBlack( reader2 );

        System.out.println( "---------------------showReaderOfBlackList---------------" );
        List<Reader> readerList = new ArrayList<>( library.showReaderOfBlackList() );
        for (Reader reader : readerList) {
            System.out.println( reader );
        }

        System.out.println( "-------------giveIssueToReader Alex book--------------" );
        library.giveIssueToReader( book1, reader2 );

        System.out.println( "---------------------showIssueOfReader------------------ " );
        library.showIssueOfReader( reader1 );
        library.showIssueOfReader( reader2 );
        library.showIssueOfReader( reader3 );

        System.out.println( "---------------------showIssueAllReader-------------------" );
        library.showIssueAllReader();

        System.out.println( "---------------------sortIssueOfLibraryByTitle-----------" );
        library.sortIssueByTitle();

        System.out.println( "---------------------sortIssueByAuthor------------------ " );
        library.sortIssueByAuthor();

        System.out.println( "---------------------sortIssueByYear---------------------" );
        library.sortIssueByYear();
        library.showIssueLibrary();

        System.out.println( "---------------------showByIssueByYear - 2000 year-------" );
        library.showByIssueByYear(2000);

        System.out.println( "---------------------findIssueByWord - Java--------------" );
        List<Issue> findWord = new ArrayList<>( library.findIssueByWord("Java"));
        for (Issue issue : findWord) {
            System.out.println( issue );
        }

        System.out.println( "---------------------saveIssueToFile--------------" );
        libraryController.saveIssueReaderToFile(library.getPrints(), "issueLibrary.txt");

        System.out.println( "---------------------showIssueFromFile--------------" );
        libraryController.showLibraryFromFile("issueLibrary.txt");

    }
}
