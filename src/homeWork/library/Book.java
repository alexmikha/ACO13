package homeWork.library;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Book extends Issue {

    private Author author;

    public Book(Author author, String title, String publisher, int year) {
        super(title, publisher, year);
        this.author = new Author(author.getAuthorName());
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Issue)) return false;
        if (!super.equals(o)) return false;

        Book tmp = (Book) o;
        return ((this.author.getAuthorName() != null) && this.author.getAuthorName().equals(tmp.author));
    }


    @Override
    public int compareTo(Issue o) {
        if (this == o) return 0;

        Book tmp = (Book) o;
        if (this.author != null) {
            return (this.author.compareTo(tmp.author));
        }
        if (getTitle() != null) {
            return getTitle().compareTo(tmp.getTitle());
        }
        return 0;
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