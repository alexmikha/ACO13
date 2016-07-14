package main.java.homeWork.library.model;

import java.io.Serializable;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Newspaper extends Issue implements Serializable {

    private int numberNewspaper;

    public Newspaper(String title, String publisher, int year, int numberNewspaper) {
        super(title, publisher, year);
        this.numberNewspaper = numberNewspaper;
    }

    public Newspaper() {

    }

    public int getNumberNewspaper() {
        return numberNewspaper;
    }

    public void setNumberNewspaper(int numberNewspaper) {
        this.numberNewspaper = numberNewspaper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Newspaper newspaper = (Newspaper) o;
        return getNumberNewspaper() == newspaper.getNumberNewspaper();

    }

    @Override
    public String toString() {
        String strCount = "not available";
        if (getCount() > 0)
            return String.format("Newspaper - title - %1$s, publisher - %2$s, year - %3$d, numberNewsPaper - %4$d, count - %5$d",
                    getTitle(), getPublisher(), getYear(), numberNewspaper, getCount());
        else return String.format("Journal - title - %1$s, publisher - %2$s, year - %3$d, numberNewsPaper - %4$d, %5$s",
                getTitle(), getPublisher(), getYear(), numberNewspaper, strCount);

    }

    public String asString() {
        return String.format("Newspaper - title - %1$s, publisher - %2$s, year - %3$d, numberNewsPaper - %4$d",
                getTitle(), getPublisher(), getYear(), numberNewspaper);
    }
}
