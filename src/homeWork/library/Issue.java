package homeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Issue implements Comparable {
    private String title;
    private String publisher;
    private int year;
    private int count;
    private boolean available;

    private List<Issue> issueList = new ArrayList<>();

    public Issue(String title, String publisher, int year) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.count = 0;
    }

    public List<Issue> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<Issue> issueList) {
        this.issueList = issueList;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Issue issue = (Issue) o;

        if (getYear() != issue.getYear()) return false;
        if (getCount() != issue.getCount()) return false;
        if (isAvailable() != issue.isAvailable()) return false;
        if (getTitle() != null ? !getTitle().equals(issue.getTitle()) : issue.getTitle() != null) return false;
        if (getPublisher() != null ? !getPublisher().equals(issue.getPublisher()) : issue.getPublisher() != null)
            return false;
        return getIssueList() != null ? getIssueList().equals(issue.getIssueList()) : issue.getIssueList() == null;

    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = 31 * result + getYear();
        result = 31 * result + getCount();
        result = 31 * result + (isAvailable() ? 1 : 0);
        result = 31 * result + (getIssueList() != null ? getIssueList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("count - %s", count);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o != null && o instanceof Issue) {
        } else {
            Issue tmp = (Issue) o;
            if (!this.getTitle().equals(tmp.getTitle())) {
                return this.getTitle().compareTo(tmp.getTitle());
            }
            if (this.publisher.equals(tmp.getPublisher())) {
                return this.compareTo(tmp.publisher);
            }
            if (this.year != (tmp.year)) {
                return this.year - (tmp.year);
            }
//                if (this.count !=(tmp.count)) {
//                    return this.count -(tmp.count);
//                }
        }
        return 0;
    }
}
