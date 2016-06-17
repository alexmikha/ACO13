package homeWork.library;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Book extends Issue  {

    private String author;

//    public Book(){
//
//    }

    public Book(String title, String author , String publisher, int year) {
        super(title, publisher, year);
        this.author = author;

    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
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

        return String.format("Book - %1s, author - %2$s, publisher - %3$s, year - %4$d",
                getTitle(), author, getPublisher(), getYear());
    }
}
