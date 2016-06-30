package homeWork.library;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Journal extends Issue {

private String nameJournal = "Journal";

    private int numberJournal;


    public Journal(String title, String publisher, int year, int numberJournal) {
        super(title, publisher, year);
        this.numberJournal = numberJournal;
    }


    public int getNumberJournal() {
        return numberJournal;
    }

    public String getNameJournal() {
        return nameJournal;
    }

    public void setNameJournal(String nameJournal) {
        this.nameJournal = nameJournal;
    }

    public void setNumberJournal(int numberJournal) {
        this.numberJournal = numberJournal;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return getNumberJournal() == journal.getNumberJournal();

    }

//    @Override
//    public String toString() {
//        return "Journal - "  +
//                "numberJournal - " + numberJournal + super.toString();
//    }

    @Override
    public String toString() {
        String strCount = "not available";
        if (getCount() > 0)
        return String.format("Journal - title - %1$s, publisher - %2$s, year - %3$d, numberJournal - %4$d, count - %5$d",
               getTitle(), getPublisher(), getYear(), numberJournal, getCount());
        else return String.format("Journal - title - %1$s, publisher - %2$s, year - %3$d, numberJournal - %4$d, %5$s",
                getTitle(), getPublisher(), getYear(), numberJournal, strCount);

    }

    public String asString() {
        return String.format("Journal - title - %1$s, publisher - %2$s, year - %3$d, numberJournal - %4$d",
                getTitle(), getPublisher(), getYear(), numberJournal);
    }
}
