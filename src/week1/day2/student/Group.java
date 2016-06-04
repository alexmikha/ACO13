package week1.day2.student;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by mykhailov on 22.05.2016.
 */
public class Group {
    private static final int DEFAULT_SIZE = 15;

    //   private int counter;
    private String nameGroup;
    SortByName sortByName = new SortByName();
    SortBySurName sortBySurName = new SortBySurName();
    SortByBirthDay sortByBirthDay = new SortByBirthDay();
    SortByAverageMark sortByAverageMark = new SortByAverageMark();

    private List<Student> studList = new ArrayList<>(DEFAULT_SIZE);

    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
        this.studList = new ArrayList<>();
    }

    public Group(String nameGroup, List<Student> studList) {
        this.nameGroup = nameGroup;
        this.studList = studList;
    }


    public boolean addStudent(Student student) {
        if (student == null) return false;
        if (studList.contains(student)) return false;
        return  studList.add(student);
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

    public String searchBySurName(String surname) {
        for (Student st : studList) {
            if (surname.equals(st.getSurname()))
                System.out.println("Found the student - " + " " + st);
        }
        return surname;
    }

    public String searchByName(String name) {
        for (Student stud : studList) {
            if (name.equals(stud.getName()))
                System.out.println("Found the student - " + " " + stud);
        }
        return name;
    }

    public boolean delStudent(Student student) {
        return studList.remove(student);
    }
}