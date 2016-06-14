package homeWork.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Library {

    private Issue issue;
    private ArrayList<Book> prints;
    private List<Reader> readers = new ArrayList<>();

    private Comparator<Reader> sortByNameReaders = (o1, o2) -> o1.getNameReader().compareTo(o2.getNameReader());
    private Comparator<Issue> sortByIssue = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
    private Comparator<Book> sortByAuthorBook = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());
    private Comparator<Book> sortIssueByYear = (o1, o2) -> o1.getYear() - o2.getYear();


    public Library() {
        prints = new ArrayList<>();
    }

    public Library(List<Reader> readers) {
        this.readers = readers;
        prints = new ArrayList<>();

    }

    public Library(List<Issue> prints, List<Reader> readers) {
        this.prints = new ArrayList<>();
        this.readers = readers;
    }

    public void showIssueLibrary() {
        if (prints == null) return;
        for (int i = 0; i < prints.size(); i++) {
            System.out.println(prints.get(i));
        }
    }


    public void showReadersLibrary() {
        readers.sort(sortByNameReaders);
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i));
        }
    }

    public boolean addIssueToLibrary(Book issue) {
        if (issue == null) return false;
        if (prints.isEmpty()) {
            prints.add(issue);
            issue.setCount(1);
        } else {
            for (int i = 0; i < prints.size(); i++) {
                if (issue.equals(prints.get(i))) {  // && prints.get(i).getCount() >= 1
                    issue.setCount(prints.get(i).getCount() + 1);
                } else
                    prints.add(issue);
                issue.setCount(prints.get(i).getCount());

                return true;
            }
        }
        return false;
    }

    public boolean addReaderToList(Reader reader) {
        if (reader == null || readers == null) return false;
        readers.add(reader);
        return true;
    }

    public boolean giveIssueToReader(Issue issue, Reader readerGive) {
        if (issue == null || readerGive == null) return false;
        for (Reader reader1 : readers) {
            if (reader1.equals(readerGive))
                if (readerGive.isReaderBlackList() || readerGive.getReaderList().size() >= 3) return false;
        }

        for (Book issue1 : prints) {
            if (issue.equals(issue1) && issue.getCount() >= 1) {
                readerGive.getReaderList().add(issue1);
            }
        }
        for (int i = 0; i < prints.size(); i++) {
            if (prints.get(i).equals(issue)) {
                if (prints.get(i).getCount() >= 1)
                    prints.get(i).setCount((prints.get(i).getCount() - 1));
                if (prints.get(i).getCount() == 0)
                    prints.remove(i);
            }
        }

        return false;
    }


    public void showIssueOfReader(Reader reader) {
        if (reader == null || prints == null) return;
        for (int i = 0; i < reader.getReaderList().size(); i++) {
            System.out.println(reader);
            System.out.println(reader.getReaderList().get(i));
        }
    }


    public void showIssueByAuthor() {
        prints.sort(sortByAuthorBook);

    }

    public void showIssueByYear() {
        prints.sort(sortIssueByYear);
    }


    public boolean addReaderOnBlack(Reader readers) {
        if (readers == null) return false;
        for (int i = 0; i < readers.getReaderList().size(); i++) {
            if (readers.equals(getReaders().get(i))) {
                readers.setReaderBlackList(true);
            }
        }
        return true;
    }


    public List<Reader> showReaderOfDlackList() {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).isReaderBlackList()) {
                System.out.println(readers.get(i));
                i++;
            }
        }
        return readers;
    }

    public void showByIssueByYear(int year) {
        if (year == 0) return;
        List<Issue> printsYear = new ArrayList();

        for (Book print : prints) {
            if (print.getYear() == year) {

                printsYear.add(print);
            }
        }
        for (Issue issue1 : printsYear) {
            System.out.println(issue1);
        }
    }

    public void findIssueByWord(String string) {
        if (string == null) return;
        for (Book print : prints) {
            if (print.getTitle().toString().contains(string))
                System.out.println(print);

        }
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }
}

