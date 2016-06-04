package homeWork.library;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Issue {

    String name;
    private int count;

    public Issue(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Issue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
