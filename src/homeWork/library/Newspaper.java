package homeWork.library;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Newspaper extends Issue {

    private String yearNewspaper;
    private String namberNewspaper;


    public Newspaper(String name, int count, String yearNewspaper, String namberNewspaper) {
        super(name, count);
        this.yearNewspaper = yearNewspaper;
        this.namberNewspaper = namberNewspaper;
    }

    public Newspaper(String name, String yearNewspaper, String namberNewspaper) {
        super(name);
        this.yearNewspaper = yearNewspaper;
        this.namberNewspaper = namberNewspaper;
    }

    public String getYearNewspaper() {
        return yearNewspaper;
    }

    public void setYearNewspaper(String yearNewspaper) {
        this.yearNewspaper = yearNewspaper;
    }

    public String getNamberNewspaper() {
        return namberNewspaper;
    }

    public void setNamberNewspaper(String namberNewspaper) {
        this.namberNewspaper = namberNewspaper;
    }
    @Override
    public String toString() {
        return "Newspaper{" +
                "name=" + getName() +
                ",count=" + getCount() +
                "yearNewspaper='" + yearNewspaper + '\'' +
                ", namberNewspaper='" + namberNewspaper + '\'' +
                '}';
    }
}
