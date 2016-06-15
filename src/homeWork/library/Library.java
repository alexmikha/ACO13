package homeWork.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Library {

    private List<Issue> prints;
    private List<Book> printsBook;
    private List<Reader> readers = new ArrayList<>();

    private Comparator<Reader> sortByNameReaders = (o1, o2) -> o1.getNameReader().compareTo(o2.getNameReader());
    private Comparator<Issue> sortByIssue = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
    private Comparator<Book> sortByAuthorBook = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());
    private Comparator<Issue> sortIssueByYear = (o1, o2) -> o1.getYear() - o2.getYear();


    public Library() {
        printsBook = new ArrayList<>();
        prints = new ArrayList<>();
        readers = new ArrayList<>();
    }


    public void showIssueLibrary() {
        if (prints == null) return;
        prints.sort(sortByIssue);
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

    public boolean addIssueToLibrary(Issue issue) {
        if (issue == null) return false;
        issue.setCount(1);
        int index;
        if (prints.contains(issue)) {
            index = prints.indexOf(issue);
            prints.get(index).setCount(issue.getCount() + 1);
        } else
            prints.add(issue);
        issue.setCount(issue.getCount());
        return true;
    }


    public boolean addReaderToList(Reader reader) {
        if (reader == null || readers == null || readers.contains(reader)) return false;
        readers.add(reader);
        return true;
    }

    public boolean giveIssueToReader(Issue readerIssue, Reader readerGive) {
        if (readerIssue == null || readerGive == null) return false;

        if (!readers.contains(readerGive) || readers.contains(readerGive.isReaderBlackList()) ||
                readers.contains(readerIssue.getCount() >= 1)) return false;

        if (prints.contains(readerIssue) || prints.contains(readerIssue.getCount() >= 1)) {
            readerGive.getReaderList().add(readerIssue);
        }
        int index;
        if (prints.contains(readerIssue)) {
            index = prints.indexOf(readerIssue);

            if (prints.get(index).getCount() >= 1) {
                prints.get(index).setCount((prints.get(index).getCount() - 1));
            } else
                prints.remove(index);
        }
        return false;
    }

    public boolean getIssueOfReader(Issue readerIssue, Reader readerGet) {
        if (readerIssue == null || readerGet == null) return false;

        if (!readers.contains(readerGet)) return false;

        if (prints.contains(readerIssue)) {
            readerGet.getReaderList().remove(readerIssue);
        }

        addIssueToLibrary(readerIssue);

        return false;
    }


    public void showIssueOfReader(Reader issueReader) {
        if (issueReader == null || prints == null || !readers.contains(issueReader)) return;
        if (issueReader.getReaderList().size() > 0) {
            for (int i = 0; i < issueReader.getReaderList().size(); i++) {
                System.out.println(issueReader);
                System.out.println(issueReader.getReaderList().get(i));
            }
        }else
            System.out.println("Readers do not have prints");
    }


    public void sortIssueByAuthor() {
        printsBook.sort(sortByAuthorBook);

    }

    public void sortIssueByYear() {
        prints.sort(sortIssueByYear);
    }


    public boolean addReaderOnBlack(Reader readerBlack) {
        if (readerBlack == null) return false;

        if (readers.contains(readerBlack))
            readerBlack.setReaderBlackList(true);
        return true;
    }


    public List<Reader> showReaderOfBlackList() {
        if (readers == null) return null;
        List<Reader> readerBlack = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).isReaderBlackList())
                readerBlack.add(readers.get(i));
        }
        readerBlack.sort(sortByNameReaders);
        for (Reader reader : readerBlack) {
            System.out.println(reader);
        }
        return readerBlack;
    }

    public List<Issue> showByIssueByYear(int year) {
        if (year == 0 || year < 0) return null;
        List<Issue> printsYear = new ArrayList();

        for (Issue print : prints) {
            if (print.getYear() == year) {
                printsYear.add(print);
            }
        }
        printsYear.sort(sortIssueByYear);
        for (Issue issue1 : printsYear) {
            System.out.println(issue1);
        }
        return printsYear;
    }

    public void findIssueByWord(String string) {
        if (string == null) return;
        List<Issue> isuueWord = new ArrayList<>();
        for (Issue print : prints) {
            if (print.getTitle().toString().contains(string))
                isuueWord.add(print);
        }
        isuueWord.sort(sortByIssue);
        for (Issue issueWord : isuueWord) {
            System.out.println(issueWord);

        }
    }
}

