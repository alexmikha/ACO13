package main.java.homeWork.library.model;

import java.io.Serializable;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Issue implements Comparable<Issue>, Serializable {

    private String title;
    private String publisher;
    private int year;
    private int count;
    private Author author;
    private String strCount;
    private boolean readerIssue;

    public Issue(String title, String publisher, int year) {
        super();
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.count = 0;
        this.readerIssue = false;
    }

    public Issue() {

    }

    public Author getAuthor() {
        return author;
    }

//    public void setAuthor(Author author) {
//        this.author = author;
//    }


    public boolean isReaderIssue() {
        return readerIssue;
    }

    public void setReaderIssue(boolean readerIssue) {
        this.readerIssue = readerIssue;
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
        strCount = "not available";
        if (count == 0)
            setCount(strCount);
        return count;

    }

    private void setCount(String strCount) {
        this.strCount = strCount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return this.title.equals(issue.title) && this.publisher.equals(issue.publisher) &&
                this.publisher.equals(issue.publisher) && this.year == issue.year;
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
        if (this.count != (o.count)) {
            return this.count - (o.count);
        }
        return 0;
    }


    @Override
    public String toString() {
        strCount = "not available";
        if (getCount() > 0)
            return String.format("title - %1s,  publisher - %2$s, year - %3$d, count - %4$d",
                    getTitle(), getPublisher(), getYear(), getCount());
        else
            return String.format("title - %1s,  publisher - %2$s, year - %3$d,  %4$s",
                    getTitle(), getPublisher(), getYear(), strCount);
    }

    public String asString() {
        return String.format("title - %1s,  publisher - %2$s, year - %3$d",
                getTitle(), getPublisher(), getYear());
    }
}
