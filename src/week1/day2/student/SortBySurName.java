package week1.day2.student;

import java.util.Comparator;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class SortBySurName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
