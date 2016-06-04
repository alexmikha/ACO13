package homeWork.library;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Book extends Issue{

    private int id;
    private String autor;
    private String publisherName;
    private int year;

    public Book(int id, String name, int count, String autor, String publisherName, int years) {
        super(name, count);
        this.id = id;
        this.autor = autor;
        this.publisherName = publisherName;
        this.year = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getYears() {
        return year;
    }

    public void setYears(int years) {
        this.year = years;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                "name=" + getName() +
                ",count=" + getCount() +
                ", autor='" + autor + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", years=" + year +
                '}';
    }


}
