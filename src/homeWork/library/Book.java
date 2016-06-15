package homeWork.library;

/**
 * Created by mykhailov on 02.06.2016.
 */
class Book extends Issue implements Comparable {

    private String author;

    Book(String title, String author, String publisher, int year) {
        super(title, publisher, year);
        this.author = author;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
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
    public int compareTo(Object o) {

        if (this == o) return 0;
        if (o != null && o instanceof Issue) {
        } else {
            Book tmp = (Book) o;
            if (!this.author.equals(tmp.author)) {
                return this.author.compareTo(tmp.author);
            }
        }
        return 0;
    }

    @Override
    public String toString() {

        return String.format("Book - %1s, author - %2$s, publisher - %3$s, year - %4$d, count - %5$s",
                getTitle(), author, getPublisher(), getYear(), getCount());
    }
}
