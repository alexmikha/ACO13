package week1.day2.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class TDD {

    public static void main(String[] args) {

        Group group = new Group("ACO");
        Student st1 = new Student("Alex", "Kenton", new MyDate(1989, 12, 12), 'M');
        Student st2 = new Student("Jack", "Fisher", new MyDate(1990, 3, 11), 'M');
//--------------------------addStudent st1-----------------------------------------
        boolean actual = group.addStudent(st1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addStudent st1"
                , actual, true, actual);
//--------------------------addStudent st2-----------------------------------------
        boolean actual1 = group.addStudent(st2);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addStudent st2"
                , actual1, true, actual1);
//---------------------------searchName-----------------------------------------
        List<Student> tmp1 = new ArrayList<>();
        tmp1.add(st1);
        List<Student> actual2 = group.searchByName("Alex");
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "searchName"
                , tmp1.equals(actual2), tmp1, actual2);
//--------------------------searchSurName------------------------------------------
        List<Student> tmp2 = new ArrayList<>();
        tmp2.add(st2);
        List<Student> actual3 = group.searchBySurName("Fisher");
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "searchSurName"
                , tmp2.equals(actual3), tmp2, actual3);

// --------------------------delStudent-----------------------------------------
        boolean actual4 = group.delStudent(st1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "delStudent"
                , actual4, true, actual4);

    }
}

