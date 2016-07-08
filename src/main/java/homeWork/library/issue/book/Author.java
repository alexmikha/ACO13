package main.java.homeWork.library.issue.book;

import java.io.Serializable;

/**
 * Created by mykhailov on 17.06.2016.
 */
public class Author  implements Comparable<Author>, Serializable {

    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public Author() {

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

  public  boolean equals(Object o){
      if (this == o) return true;
      if (o == null) return false;
      if (!(o instanceof Book)) return false;
      Author author = (Author) o;
      return this.authorName.equals(author.authorName);
  }

    @Override
    public int compareTo(Author o) {
        if (this == o) return 0;
        if (this.authorName != null) {
            return this.authorName.compareTo(o.authorName);
        }
        return 0;
    }
}
