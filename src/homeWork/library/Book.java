package homeWork.library;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Book extends Issue {

    private String autor;
    private String publisherName;


    public Book(String name, String autor, String publisherName, int year, int count) {
        super(name,count, year);
        this.autor = autor;
        this.publisherName = publisherName;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }



    @Override
    public String toString() {
        return String.format("%1$s, %2$s, %3$s, %4$d, %5$d",
                getName(), autor, publisherName, getYear(), getCount());

    }
}
