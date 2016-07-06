package main.java.homeWork.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mykhailov on 03.07.2016.
 */
public class MenuLibrary {

    private BufferedReader bf = new BufferedReader( new InputStreamReader( System.in ) );

    private Scanner scString = new Scanner( System.in );
    private Scanner scInt = new Scanner( System.in );

    private Library library = new Library();
    private SerialisationLibrary libraryToFile = new SerialisationLibrary();
    private LibraryFromFile libraryFromFile = new LibraryFromFile();
    private Author author = new Author();
    private Issue issue = new Issue();
    private Book book = new Book();
    private Journal journal = new Journal();
    private Newspaper newspaper = new Newspaper();
    private Reader reader = new Reader();

    public MenuLibrary() {

    }

    public int menu() throws IOException {
        System.out.println();
        System.out.println( "Select:" );

        System.out.println( 0 + " Exit the menu" );
        System.out.println( 1 + " Add issue to library" );
        System.out.println( 2 + " Add reader to list" );
        System.out.println( 3 + " Give issue reader" );
        System.out.println( 4 + " Get issue from reader" );
        System.out.println( 5 + " Look issue library" );
        System.out.println( 6 + " Look issue the reader" );
        System.out.println( 7 + " Look all readers of library" );
        System.out.println( 8 + " Look issue all readers" );
        System.out.println( 9 + " Add reader to blackList" );
        System.out.println( 10 + " Look reader  blackList" );
        System.out.println( 11 + " Find issue the year publisher " );
        System.out.println( 12 + " Find issue  by keyword" );
        System.out.println( 13 + " Save issue to file" );
        System.out.println( 14 + " Save readers to file" );
        System.out.println( 15 + " Look issue by file" );
        System.out.println( 16 + " Look readers by file" );
        Scanner menu = new Scanner( System.in );

        int choice = 0;
        if (menu.hasNextInt())
            choice = menu.nextInt();

        switch (choice) {
            case 0:
                menu.close();
                return 0;
            case 1:
                createIssue();
                if (issue == book)
                    library.addIssueToLibrary( book );
                if (issue == journal)
                    library.addIssueToLibrary( journal );
                if (issue == newspaper)
                    library.addIssueToLibrary( newspaper );
                break;
            case 2:
                library.addReaderToList( createReader() );
                break;
            case 3:
                library.giveIssueToReader( createIssue(), createReader() );
                break;
            case 4:
                library.returnIssueToLibOfReader( createIssue(), createReader() );
                break;
            case 5:
                library.showIssueLibrary();
                break;
            case 6:
                library.showIssueOfReader( createReader() );
                break;
            case 7:
                library.showReadersLibrary();
                break;
            case 8:
                library.showIssueAllReader();
                break;
            case 9:
                library.addReaderOnBlack( createReader() );
                break;
            case 10:
                List<Reader> readerList = new ArrayList<>( library.showReaderOfBlackList() );
                for (Reader reader : readerList) {
                    System.out.println( reader );
                }
                break;
            case 11:
                System.out.println( "Enter year of publishing:" );
                issue.setYear( scInt.nextInt() );
                library.showByIssueByYear( issue.getYear() );
                break;
            case 12:
                System.out.println( "Enter the word:" );
                String word;
                word = scString.nextLine();
                List<Issue> findWord = new ArrayList<>( library.findIssueByWord( word ) );
                for (Issue issue : findWord) {
                    System.out.println( issue );
                }
                break;
            case 13:
                libraryToFile.saveIssueReaderToFile( library.getPrints(), "issueLibrary.txt" );
                break;
            case 14:
                libraryToFile.saveIssueReaderToFile( library.getReaders(), "readerLibrary.txt" );
                break;
            case 15:
              libraryFromFile.showLibraryFromFile( "issueLibrary.txt" );
                break;

            case 16:
                libraryFromFile.showLibraryFromFile( "readerLibrary.txt" );
                break;
        }
        return menu();
    }

    public Reader createReader() {
        System.out.println( "Enter name reader:" );
        reader.setNameReader( scString.nextLine() );
        System.out.println( "Enter surname reader:" );
        reader.setSurnameReader( scString.nextLine() );
        System.out.println( "Enter address reader:" );
        reader.setAddress( scString.nextLine() );
        System.out.println( "Enter phone reader:" );
        reader.setPhone( scString.nextLine() );
        reader = new Reader( reader.getNameReader(), reader.getSurnameReader(), reader.getAddress(), reader.getPhone() );
        return reader;
    }

    public Issue createIssue() throws IOException {
        System.out.println( "Введите name title:" );
        issue.setTitle( scString.nextLine() );

        System.out.println( "Введите name publisher:" );
        issue.setPublisher( scString.nextLine() );

        System.out.println( "Введите year:" );
        issue.setYear( scInt.nextInt() );

        System.out.println( "Введите" );
        System.out.println( "j - если journal" );
        System.out.println( "n - если newspaper" );
        System.out.println( "b - если book" );

        //typeIssue = scString.nextLine();
        String typeIssue = bf.readLine();

        if (typeIssue.equals( "b" )) {
            System.out.println( "Введите name author:" );
            author.setAuthorName( scString.nextLine() );
            book = new Book( issue.getAuthor(), issue.getTitle(), issue.getPublisher(), issue.getYear() );
        }

        System.out.println( "Введите number issue:" );
        if (typeIssue.equals( "j" )) {
            journal.setNumberJournal( scInt.nextInt() );
            journal = new Journal( issue.getTitle(), issue.getPublisher(), issue.getYear(), journal.getNumberJournal() );
        }
        if (typeIssue.equals( "n" )) {
            newspaper.setNumberNewspaper( scInt.nextInt() );
            newspaper = new Newspaper( issue.getTitle(), issue.getPublisher(), issue.getYear(), journal.getNumberJournal() );
        }
        return issue;
    }
}
