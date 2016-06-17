package homeWork.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Library {

    private List<Issue> prints;
    private List<Reader> readers ;

    private Comparator<Reader> sortByNameReaders = (o1, o2) -> o1.getNameReader().compareTo(o2.getNameReader());
    private Comparator<Issue> sortByIssue = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
    private Comparator<Issue> sortIssueByYear = (o1, o2) -> (o1.getYear() - o2.getYear());
    private Comparator<Book> sortIssueByAuthor = (o1, o2) -> o1.getAuthor().compareTo(o1.getAuthor()); // ?

    public Library() {
        prints = new ArrayList<>();
        readers = new ArrayList<>();
    }


    public void showIssueLibrary() {
        if (prints.isEmpty()) return;
        //    prints.sort(sortByIssue);
        for (int i = 0; i < prints.size(); i++) {
            System.out.print(prints.get(i));
            System.out.println(", count - " + prints.get(i).getCount());
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
        // issue.setCount(issue.getCount());
        return true;
    }


    public boolean addReaderToList(Reader reader) {
        if (reader == null || readers.contains(reader)) return false;
        readers.add(reader);
        return true;
    }

    public boolean giveIssueToReader(Issue readerIssue, Reader readerGive) {
        if (readerIssue == null || readerGive == null || !prints.contains(readerIssue)) return false;
        if (readerGive.getCountIssue() >= 2 || !readers.contains(readerGive) || readerGive.isReaderBlackList())
            return false;

        readerGive.getReaderList().add(readerIssue);
        readerGive.setCountIssue(readerGive.getCountIssue() + 1);

        int index;
        index = prints.indexOf(readerIssue);

        if (prints.get(index).getCount() > 1) {
            prints.get(index).setCount(prints.get(index).getCount() - 1);
        } else if (prints.get(index).getCount() == 0) {
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
        if (issueReader == null || !readers.contains(issueReader)) return;
        if (issueReader.getReaderList().size() > 0) {
            System.out.println(issueReader + " :");
            for (int i = 0; i < issueReader.getReaderList().size(); i++) {
                System.out.println(issueReader.getReaderList().get(i));
            }
        } else
            System.out.println("Readers do not have prints");
    }

    public void showIssueAllReader() {
        for (Reader reader : readers) {
            if (reader.getCountIssue() > 0)
                System.out.println(reader + " :");
            System.out.println(reader.asString());
        }
    }

    public void sortIssueByTitle() {
        List<Issue> isuueTitle = new ArrayList<>();
        for (Issue print : prints) {
            isuueTitle.add(print);
        }
        isuueTitle.sort(sortByIssue);
        for (int i = 0; i < isuueTitle.size(); i++) {
            System.out.print(isuueTitle.get(i));
            System.out.println(", count - " + isuueTitle.get(i).getCount());
        }
    }


//    public void sortIssueByAuthor() {
//        prints.sort(sortIssueByAuthor);
//    }

    public void sortIssueByAuthor() {
        List<Issue> isuueAuthor = new ArrayList<>();
        for (Issue print : prints) {
            isuueAuthor.add(print);
        }
        isuueAuthor.sort(sortByIssue);    // если вставить sortIssueByAuthor не работает, рабираюсь
        for (int i = 0; i < isuueAuthor.size(); i++) {
            System.out.print(prints.get(i));
            System.out.println(", count - " + isuueAuthor.get(i).getCount());
        }
    }

    public void sortIssueByYear() {
        prints.sort(sortIssueByYear);
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


    public void findIssueByWord(String string) {
        if (string == null) return;
        List<Issue> isuueWord = new ArrayList<>();
        for (Issue print : prints) {
            if (print.getTitle().contains(string))
                isuueWord.add(print);
        }
        isuueWord.sort(sortByIssue);
        for (Issue issueWord : isuueWord) {
            System.out.println(issueWord);
        }
    }
}

