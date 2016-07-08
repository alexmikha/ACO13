package main.java.homeWork.library.issue.book;

import main.java.homeWork.library.issue.Issue;

import java.io.Serializable;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Book extends Issue implements Serializable {

    private Author author;

    public Book(Author author, String title, String publisher, int year) {
        super(title, publisher, year);
        this.author = new Author(author.getAuthorName());
    }

    public Book() {

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book - " +
                "author = '" + author.getAuthorName() + '\'' +
                ", " + super.toString();
    }

    public String asString() {
        return String.format("Book - author - %1$s - title - %2$s, publisher - %3$s, year - %4$d",
                author.getAuthorName(), getTitle(), getPublisher(), getYear());
    }
}