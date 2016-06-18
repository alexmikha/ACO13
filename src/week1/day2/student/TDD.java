package week1.day2.student;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class TDD {

    public static void main(String[] args) {

        Group group = new Group("ACO");
        Student st1 = new Student("Alex", "Kenton", new MyDate(1989, 12, 12), 'M');
        Student st2 = new Student("Jack", "Fisher", new MyDate(1989, 3, 13), 'M');
//--------------------------addStudent-----------------------------------------
        boolean expected = true;
        boolean actual = group.addStudent(st1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addStudent"
                , expected == actual, expected, actual);

//---------------------------sort-----------------------------------------
//        boolean expected3 = true;
//        Student actual3 = group.sort();
//        System.out.printf("Method name - %s, result - %s," +
//                        " expected - %s, actual - %s\n", "sort"
//                , expected3 == actual3, expected3, actual3);

//--------------------------search------------------------------------------
        String expected2 = "Kenton";
        Student actual2 = group.searchBySurName("Kenton");
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "search"
                , expected2.equals(actual2), expected2, actual2);

// --------------------------delStudent-----------------------------------------
        boolean expected1 = true;
        boolean actual1 = group.delStudent(st1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "delStudent"
                , expected1 == actual1, expected1, actual1);

    }
}

