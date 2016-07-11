package main.java.homeWork.library.view;

import main.java.homeWork.library.model.Author;
import main.java.homeWork.library.model.*;
import main.java.homeWork.library.controller.LibraryController;
import main.java.homeWork.library.model.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 03.07.2016.
 */
public class MenuLibrary {

    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    private Library library = new Library();
    private LibraryController libraryController = new LibraryController();

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
        System.out.println("Select:");

        System.out.println(1 + " Add issue to library");
        System.out.println(2 + " Add reader to list");
        System.out.println(3 + " Give issue reader");
        System.out.println(4 + " Get issue from reader");
        System.out.println(5 + " Look issue library");
        System.out.println(6 + " Look issue the reader");
        System.out.println(7 + " Look all readers of library");
        System.out.println(8 + " Look issue all readers");
        System.out.println(9 + " Add reader to blackList");
        System.out.println(10 + " Look reader  blackList");
        System.out.println(11 + " Find issue the year publisher ");
        System.out.println(12 + " Find issue  by keyword");
        System.out.println(13 + " Save issue to file");
        System.out.println(14 + " Save readers to file");
        System.out.println(15 + " Look issue by file");
        System.out.println(16 + " Look readers by file");
        System.out.println(17 + " Save library to file");
        System.out.println(18 + " Look library by file");

        String menu = bf.readLine();
        switch (menu) {
            case "0":
                bf.close();
                return 0;
            case "1":
                createIssue();
                if (issue == book) library.addIssueToLibrary(book);
                if (issue == journal) library.addIssueToLibrary(journal);
                if (issue == newspaper) library.addIssueToLibrary(newspaper);
                break;
            case "2":
                library.addReaderToList(createReader());
                break;
            case "3":
                library.giveIssueToReader(createIssue(), createReader());
                break;
            case "4":
                library.returnIssueToLibOfReader(createIssue(), createReader());
                break;
            case "5":
                library.showIssueLibrary();
                break;
            case "6":
                library.showIssueOfReader(createReader());
                break;
            case "7":
                library.showReadersLibrary();
                break;
            case "8":
                library.showIssueAllReader();
                break;
            case "9":
                library.addReaderOnBlack(createReader());
                break;
            case "10":
                List<Reader> readerList = new ArrayList<>(library.showReaderOfBlackList());
                for (Reader reader : readerList) {
                    System.out.println(reader);
                }
                break;
            case "11":
                System.out.println("Enter year of publishing:");

                issue.setYear(Integer.parseInt(bf.readLine()));
                library.showByIssueByYear(issue.getYear());
                break;
            case "12":
                System.out.println("Enter the word:");
                String word;
                word = bf.readLine();
                List<Issue> findWord = new ArrayList<>(library.findIssueByWord(word));
                for (Issue issue : findWord) {
                    System.out.println(issue);
                }
                break;
            case "13":
                libraryController.saveIssueReaderToFile(library.getPrints(), "issueLibrary.txt");
                break;
            case "14":
                libraryController.saveIssueReaderToFile(library.getReaders(), "readerLibrary.txt");
                break;
            case "15":
                libraryController.showLibraryFromFile("issueLibrary.txt");
                break;
            case "16":
                libraryController.showLibraryFromFile("readerLibrary.txt");
                break;
            case "17":
                libraryController.saveLibraryToFile("library.txt");
                break;
            case "18":
                libraryController.showLibraryFromFile("library.txt");
                break;
        }
        return choiceMenu();
    }


    public int choiceMenu() throws IOException {
        System.out.println();
        System.out.println("Select:");
        System.out.println(1 + " Enter in the menu ");
        System.out.println(2 + " Exit the application ");
        String choice = bf.readLine();
        switch (choice) {
            case "1":
                menu();
                break;
            case "2":
                exitFromMenu();
                break;
        }
        return 0;
    }


    public void exitFromMenu() throws IOException {
        System.out.println("Save changes to a file?");
        System.out.println(1 + " yes");
        System.out.println(2 + " no");
        String choiceExit = bf.readLine();
        switch (choiceExit) {
            case "1":
                libraryController.saveIssueReaderToFile(library.getPrints(), "issueLibrary.txt");
                libraryController.saveIssueReaderToFile(library.getReaders(), "readerLibrary.txt");
                bf.close();
                break;
            case "2":
                bf.close();
                break;
        }
    }


    public Reader createReader() throws IOException {
        System.out.println("Enter name reader:");
        reader.setNameReader(bf.readLine());
        System.out.println("Enter surname reader:");
        reader.setSurnameReader(bf.readLine());
        System.out.println("Enter address reader:");
        reader.setAddress(bf.readLine());
        System.out.println("Enter phone reader:");
        reader.setPhone(bf.readLine());
        reader = new Reader(reader.getNameReader(), reader.getSurnameReader(), reader.getAddress(), reader.getPhone());
        return reader;
    }


    public Issue createIssue() throws IOException {
        System.out.println("Введите name title:");
        issue.setTitle(bf.readLine());

        System.out.println("Введите name publisher:");
        issue.setPublisher(bf.readLine());

        System.out.println("Введите year:");
        issue.setYear(Integer.parseInt(bf.readLine()));

        System.out.println("Введите");
        System.out.println("j - если journal");
        System.out.println("n - если newspaper");
        System.out.println("b - если book");

        String typeIssue = bf.readLine();

        if (typeIssue.equals("b")) {
            System.out.println("Введите name author:");
            author.setAuthorName(bf.readLine());
            book = new Book(issue.getAuthor(), issue.getTitle(), issue.getPublisher(), issue.getYear());
        }

        System.out.println("Введите number issue:");
        if (typeIssue.equals("j")) {
            journal.setNumberJournal(Integer.parseInt(bf.readLine()));
            journal = new Journal(issue.getTitle(), issue.getPublisher(), issue.getYear(), journal.getNumberJournal());
        }
        if (typeIssue.equals("n")) {
            newspaper.setNumberNewspaper(Integer.parseInt(bf.readLine()));
            newspaper = new Newspaper(issue.getTitle(), issue.getPublisher(), issue.getYear(), journal.getNumberJournal());
        }
        return issue;
    }
}
