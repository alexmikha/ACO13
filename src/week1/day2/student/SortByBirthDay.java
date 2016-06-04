package week1.day2.student;

import java.util.Comparator;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class SortByBirthDay implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getBirthDay().compareTo(o2.getBirthDay());
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//
//        if(o1.getBirthDay().getYearsBirth() != o2.getBirthDay().getYearsBirth())
//            return o1.getBirthDay().compareTo(o2.getBirthDay());
     //       return o1.getBirthDay().getYearsBirth() - (o2.getBirthDay().getYearsBirth());
//        }else
//        if(o1.getBirthDay().getMonthBirth() != o2.getBirthDay().getMonthBirth()) {
//            return o1.getBirthDay().getMonthBirth() - (o2.getBirthDay().getMonthBirth());
//        }else
//        if(o1.getBirthDay().getDayBirth() != o2.getBirthDay().getDayBirth()) {
//            return o1.getBirthDay().getDayBirth() - (o2.getBirthDay().getDayBirth());
//        }
//        return -1;
//        return -1;
//    }


}
