package main.java.homeWork.library.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Library implements Serializable {

    private static List<Issue> prints;
    private static List<Reader> readers;

    private transient Comparator<Reader> sortByNameReaders = (o1, o2) -> o1.getNameReader().compareTo(o2.getNameReader());
    private transient Comparator<Issue> sortByIssue = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
    private transient Comparator<Issue> sortIssueByYear = (o1, o2) -> (o1.getYear() - o2.getYear());
    private transient Comparator<Issue> sortIssueByAuthor = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());

    public Library() {
        prints = new ArrayList<>();
        readers = new ArrayList<>();
    }


    public void showIssueLibrary() {
        if (prints.isEmpty()) return;
        for (int i = 0; i < prints.size(); i++) {
            System.out.println(prints.get(i).toString());
        }
    }


    public void showReadersLibrary() {
        if (readers.isEmpty()) return;
        readers.sort(sortByNameReaders);
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i));
        }
    }

    public boolean addIssueToLibrary(Issue issue) {
        if (issue == null) return false;
        if (!prints.contains(issue))
            issue.setCount(1);
        int index;
        if (prints.contains(issue)) {
            index = prints.indexOf(issue);
            prints.get(index).setCount(issue.getCount() + 1);
        } else
            prints.add(issue);
        return true;
    }


    public Reader searchReader(Reader reader) {
        for (Reader reader1 : readers) {
            if (reader.equals(reader1)) ;
            return reader1;
        }
        return null;
    }

    public boolean addReaderToList(Reader reader) {
        if (reader == null || readers.contains(reader)) return false;
        searchReader(reader);
        readers.add(reader);
        return true;
    }

    public boolean addReaderOnBlack(Reader readerBlack) {
        if (readerBlack == null || !readers.contains(readerBlack)) return false;
        for (Reader reader : readers) {
            if (reader.equals(readerBlack))
                reader.setReaderBlackList(true);
        }
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
        return readerBlack;
    }

    public boolean giveIssueToReader(Issue readerIssue, Reader readerGet) {
        if (readerIssue == null || readerGet == null || !prints.contains(readerIssue)) return false;
        if (readerIssue.getCount() == 0) return false;
        if (readerGet.getCountIssue() >= 3) return false;
        if (!readers.contains(readerGet) || readerGet.isReaderBlackList()) return false;

        searchReader(readerGet);
        readerIssue.setCount(1);
        readerGet.getReaderList().add(readerIssue);
        readerGet.setCountIssue(readerGet.getCountIssue() + 1);

        int index;
        index = prints.indexOf(readerIssue);
        if (prints.get(index).getCount() >= 1) {
            prints.get(index).setCount(prints.get(index).getCount() - 1);
        }
        return false;
    }

    public boolean returnIssueToLibOfReader(Issue readerIssue, Reader readerGive) {
        if (readerIssue == null || readerGive == null) return false;
        if (!readers.contains(readerGive)) return false;
        for (Issue print : prints) {
            if (print.equals(readerIssue))
                readerGive.getReaderList().remove(readerIssue);
        }
        readerGive.setCountIssue(readerGive.getCountIssue() - 1);
        addIssueToLibrary(readerIssue);

        return false;
    }

    public void showIssueOfReader(Reader issueReader) {
        if (issueReader == null) return;
        if (!readers.contains(issueReader)) {
            System.out.println("This reader is not");
        } else
            for (Reader reader : readers) {
                if (reader.equals(issueReader) && reader.getCountIssue() == 0) {
                    System.out.format("%1$s, does not have prints\n", issueReader);
                } else if (reader.getCountIssue() > 0 && reader.equals(issueReader))
                    System.out.println(reader + " :");
                for (int i = 0; i < reader.getReaderList().size(); i++)
                    if (reader.equals(issueReader))
                        System.out.println(reader.getReaderList().get(i).asString());
            }
    }


    public void showIssueAllReader() {
        for (Reader reader : readers) {
//            if (reader.getCountIssue() == 0) {
//                System.out.format("%1$s, does not have prints\n", reader);
//            } else
                if (reader.getCountIssue() > 0)
                System.out.println(reader + " :");

            for (int i = 0; i < reader.getReaderList().size(); i++) {
                System.out.println(reader.getReaderList().get(i).asString());
            }
        }
    }

    public void sortIssueByTitle() {
        List<Issue> isuueTitle = new ArrayList<>();
        for (Issue print : prints) {
            isuueTitle.add(print);
        }
        isuueTitle.sort(sortByIssue);
        for (int i = 0; i < isuueTitle.size(); i++) {
            System.out.println(isuueTitle.get(i));
        }
    }

    public void sortIssueByAuthor() {
        List<Issue> isuueAuthor = new ArrayList<>();
        for (Issue print : prints) {
            if (print instanceof Book)
                isuueAuthor.add(print);
        }
        isuueAuthor.sort(sortIssueByAuthor);
        for (int i = 0; i < isuueAuthor.size(); i++) {
            System.out.println(prints.get(i));
        }
    }

    public void sortIssueByYear() {
        prints.sort(sortIssueByYear);
    }

    public List<Issue> showByIssueByYear(int year) {
        if (year == 0 || year < 0) return null;
        ArrayList<Issue> printsYear = new ArrayList<>();

        for (Issue print : prints) {
            if (print.getYear() == year) {
                printsYear.add(print);
            }
        }
        printsYear.sort(sortIssueByYear);
        for (Issue issue : printsYear) {
            System.out.println(issue);
        }
        return printsYear;
    }


    public List<Issue> findIssueByWord(String string) {
        if (string == null) return null;
        List<Issue> issueWord = new ArrayList<>();
        for (Issue print : prints) {

            if (print instanceof Book) {
                if (print.getAuthor().getAuthorName().contains(string))
                    issueWord.add(print);
            }
            if (print.getTitle().contains(string)) {
                issueWord.add(print);
            }
            if (print.getPublisher().contains(string)) {
                issueWord.add(print);
            }
        }
        return issueWord;
    }

    public static void setPrints(List<Issue> prints) {
        Library.prints = prints;
    }

    public static void setReaders(List<Reader> readers) {
        Library.readers = readers;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public List<Issue> getPrints() {
        return prints;
    }

}

