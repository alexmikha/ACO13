package homeWork.library;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Journal extends Issue implements Comparable{

  //  private  String publisher;
    private int numberJournal;


    public Journal(String title, String publisher, int numberJournal, int year) {
        super(title, publisher, year);
      //  this.publisher = publisher;
        this.numberJournal = numberJournal;
    }


    public int getNumberJournal() {
        return numberJournal;
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

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNumberJournal();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Newspaper - %1s, publisher - %2$s, numberJournal - %3$d, year - %4$d, count - %5$d",
                getTitle() ,getPublisher(), numberJournal, getYear(), getCount());

    }


}
