package homeWork.library;

/**
 * Created by mykhailov on 17.06.2016.
 */
public class Author implements Comparable<Author> {

    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (getNameAuthor() != null ? !getNameAuthor().equals(author.getNameAuthor()) : author.getNameAuthor() != null)
            return false;
        return getSurnameAuthor() != null ? getSurnameAuthor().equals(author.getSurnameAuthor()) : author.getSurnameAuthor() == null;

    }

    @Override
    public int hashCode() {
        int result = getNameAuthor() != null ? getNameAuthor().hashCode() : 0;
        result = 31 * result + (getSurnameAuthor() != null ? getSurnameAuthor().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Author o) {
        if (this == o) return 0;
        if (!this.nameAuthor.equals(o.nameAuthor)) {
            return this.nameAuthor.compareTo(o.nameAuthor);
        }
        if (!this.surnameAuthor.equals(o.surnameAuthor)) {
            return this.surnameAuthor.compareTo(o.surnameAuthor);
        }
        return 0;
    }
}
