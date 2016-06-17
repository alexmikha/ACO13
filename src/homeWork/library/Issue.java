package homeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Issue implements Comparable<Issue> {
    private String title;
    private String publisher;
    private int year;
    private int count;

    List<Issue> issueList ;

    public Issue(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.count = 0;
        this.issueList = new ArrayList<>();
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Issue> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<Issue> issueList) {
        this.issueList = issueList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Issue issue = (Issue) o;

        if (getTitle() != null ? !getTitle().equals(issue.getTitle()) : issue.getTitle() != null) return false;
        if (getPublisher() != null ? !getPublisher().equals(issue.getPublisher()) : issue.getPublisher() != null)
            return false;
        return issueList != null ? issueList.equals(issue.issueList) : issue.issueList == null;

    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = 31 * result + (issueList != null ? issueList.hashCode() : 0);
        return result;
    }


        @Override
    public int compareTo(Issue o) {
        if (this == o) return 0;

            if (!this.title.equals(o.title)) {
                return this.title.compareTo(o.title);
            }
            if (!this.publisher.equals(o.getPublisher())) {
                return this.publisher.compareTo(o.publisher);
            }
            if (this.year != o.year) {
                return this.year - (o.year);
            }
//            if (this.count != (tmp.count)) {
//                return this.count - (tmp.count);
//            }
        return 0;
    }


    @Override
    public String toString() {

        return String.format("Issue - %1s, publisher - %2$s, year - %3$d, count - %4$s",
                getTitle(), getPublisher(), getYear(), getCount());
    }
}

