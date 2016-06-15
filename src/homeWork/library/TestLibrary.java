package homeWork.library;

/**
 * Created by mykhailov on 07.06.2016.
 */
public class TestLibrary {

    public static void main(String[] args) {

        Library library = new Library();
        Reader reader = new Reader();
        Book book1 = new Book("Java OPP", "Bruce Eckel", "PrintCenterUA", 2000);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "Lory Moscow", 2008);
        Book book3 = new Book("Harry Potter", "Joan Rowling ", "Scholastic Press", 1997);
        Reader reader1 = new Reader("Alex", "Kenton", "street one", "0-00-00-01");
        Reader reader2 = new Reader("Jack", "Fisher", "street two", "0-00-00-02");
        Reader reader3 = new Reader("Nick", "Evans", "street three", "0-00-00-03");

        System.out.println("---------------------addIssueToLibrary------------------");
        library.addIssueToLibrary(book3);
        library.addIssueToLibrary(book1);
        library.addIssueToLibrary(book2);
        library.addIssueToLibrary(book3);

        System.out.println("---------------------showIssueLibrary------------------");
        library.showIssueLibrary();

        System.out.println("---------------------addReaderToList---------------------");
        library.addReaderToList(reader1);
        library.addReaderToList(reader2);
        library.addReaderToList(reader3);
        System.out.println("---------------------showReadersLibrary------------------");
        library.showReadersLibrary();

        System.out.println("---------------------giveIssueToReader-------------------");
        library.giveIssueToReader(book3, reader1);

        System.out.println("---------------------showIssueOfReader------------------ ");
        library.showIssueOfReader(reader1);

        System.out.println("---------------------showIssueOfLibraryByTitle------------------");
        library.showIssueLibrary();

        System.out.println("---------------------sortIssueByAuthor------------------ ");
        library.sortIssueByAuthor();
        library.showIssueLibrary();

        System.out.println("---------------------sortIssueByYear---------------------");
        library.sortIssueByYear();
        library.showIssueLibrary();

        System.out.println("---------------------addReaderOnBlack - Alex,Nick---------------------");
        library.addReaderOnBlack(reader1);
        library.addReaderOnBlack(reader3);

        System.out.println("---------------------showReaderOfBlackList---------------------");
        library.showReaderOfBlackList();


        System.out.println("---------------------showByIssueByYear - 2000 year---------------------");
        library.showByIssueByYear(2000);

        System.out.println("---------------------findIssueByWord - Java---------------------");
        library.findIssueByWord("Java");

        System.out.println("---------------------getIssueOfReader---------------------");
        library.getIssueOfReader(book3, reader1);

        System.out.println("---------------------showIssueOfReader---------------------");
        library.showIssueOfReader(reader1);
        System.out.println("---------------------showIssueOfLibrary---------------------");
        library.showIssueLibrary();

    }

}
