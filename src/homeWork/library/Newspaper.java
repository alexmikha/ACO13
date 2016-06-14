package homeWork.library;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Newspaper extends Issue implements Comparable {

    private int namberNewspaper;


    public Newspaper(String title, String publisher, int namberNewspaper, int year) {
        super(title, publisher, year);

        this.namberNewspaper = namberNewspaper;
    }

    public int getNamberNewspaper() {
        return namberNewspaper;
    }

    public void setNamberNewspaper(int namberNewspaper) {
        this.namberNewspaper = namberNewspaper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Newspaper newspaper = (Newspaper) o;

        return getNamberNewspaper() == newspaper.getNamberNewspaper();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNamberNewspaper();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Newspaper - %1s, publisher - %2$s, namberNewspaper - %3$d, year - %4$d, count - %5$d",
                getTitle(), getPublisher(), namberNewspaper, getYear(), getCount());

    }

}
