package week1.day2.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * Created by mykhailov on 22.05.2016.
 */
public class Group {
    private static final int DEFAULT_SIZE = 15;

    private String nameGroup;
    private Comparator<Student> sortByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
    private Comparator<Student> sortBySurName = (o1, o2) -> o1.getSurname().compareTo(o2.getSurname());
    private Comparator<Student> sortByBirthDay = (o1, o2) -> o1.getBirthDay().compareTo(o2.getBirthDay());
    //        private Comparator<Student> sortByAverageMark = (o1, o2) -> {
//        if (o1.getAverageMark() < o2.getAverageMark())return -1;
//        if (o1.getAverageMark() > o2.getAverageMark())return 1;     // можно так
//        return 0;
//    };
    private Comparator<Student> sortByAverageMark = (o1, o2) -> {
        int result = Double.compare(o1.getAverageMark(), o2.getAverageMark());
        return result;
    };

    private List<Student> studList = new ArrayList<>(DEFAULT_SIZE);

    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Group(String nameGroup, List<Student> studList) {
        this.nameGroup = nameGroup;
        this.studList = studList;
    }


    public boolean addStudent(Student student) {
        if (student == null || studList.contains(student)) return false;
        return studList.add(student);
    }


    public void showGroup() {
        for (Student st : studList) {
            System.out.println(st);
        }
    }


    public void sortByName() {
        studList.sort(sortByName);
    }

    public void sortBySurName() {
        studList.sort(sortBySurName);
    }

    public void sortByBirthDay() {
        studList.sort(sortByBirthDay);
    }

    public void sortByAverageMark() {
        studList.sort(sortByAverageMark);
    }

    public Student searchByName(String name) {
        List<Student> searchName = new ArrayList<>();

        for (Student student : studList) {
            if (name.equals(student.getName()))
                searchName.add(student);
        }
        for (int i = 0; i < searchName.size(); i++) {
            System.out.println("Found the student - " + " " + searchName.get(i));
            return searchName.get(i);
        }
        System.out.println("This student " + name + " is not in the group ");
        return null;
    }


    public Student searchBySurName(String surname) {
        List<Student> searchSurName = new ArrayList<>();

        for (Student student : studList) {
            if (surname.equals(student.getSurname()))
                searchSurName.add(student);
        }
        for (int i = 0; i < searchSurName.size(); i++) {
            System.out.println("Found the student - " + " " + searchSurName.get(i));
            return searchSurName.get(i);
        }
        System.out.println("This student " + surname + " is not in the group ");
        return null;
    }


    public boolean delStudent(Student student) {
        return studList.remove(student);
    }
}