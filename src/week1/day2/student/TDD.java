package week1.day2.student;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class TDD {

    public static void main(String[] args) {

        Group group = new Group("ACO");
        Student st1 = new Student("Alex", "Kenton", new MyDate(1989, 12, 12), 'M');
        Student st2 = new Student("Jack", "Fisher", new MyDate(1990, 3, 11), 'M');
//--------------------------addStudent st1-----------------------------------------
        boolean expected = true;
        boolean actual = group.addStudent(st1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addStudent st1"
                , expected == actual, expected, actual);
//--------------------------addStudent st2-----------------------------------------
        boolean expected1 = true;
        boolean actual1 = group.addStudent(st2);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addStudent st2"
                , expected1 == actual1, expected1, actual1);
//---------------------------searchName-----------------------------------------
        Student expected2 = st1;
        Student actual2 = group.searchByName("Alex");
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "searchName"
                , expected2.equals(actual2), expected2, actual2);
//--------------------------searchSurName------------------------------------------
        Student expected3 = st2;
        Student actual3 = group.searchBySurName("Fisher");
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "searchSurName"
                , expected3.equals(actual3), expected3, actual3);

// --------------------------delStudent-----------------------------------------
        boolean expected4 = true;
        boolean actual4 = group.delStudent(st1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "delStudent"
                , expected4 == actual4, expected4, actual4);

    }
}

