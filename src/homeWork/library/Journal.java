package homeWork.library;

/**
 * Created by mykhailov on 03.06.2016.
 */
public class Journal extends Issue{

    private String yearJournal;
    private String numberJournal;


    public Journal(String name, int count, String yearJournal, String numberJournal) {
        super(name, count);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    public Journal(String name) {
        super(name);
    }

    public String getYearJournal() {
        return yearJournal;
    }

    public String getNumberJournal() {
        return numberJournal;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "name=" + getName() +
                ",count=" + getCount() +
                "yearJournal='" + yearJournal + '\'' +
                ", numberJournal='" + numberJournal + '\'' +
                '}';
    }
}
