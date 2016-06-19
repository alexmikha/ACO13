package week1.day2.student;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student("Alex", "Kenton", new MyDate(1989, 11, 16), 'M');
        //Student st2 = new Student("Alex", "Kenton", new MyDate(1988, 14, 16), 'M');
        Student st2 = new Student("Jack", "Fisher", new MyDate(1988, 12, 17), 'M');
        Student st3 = new Student("Nik", "Evans", new MyDate(1988, 4, 15), 'M');

        Group studGroup = new Group("ACO13");

        studGroup.addStudent(st2);
        studGroup.addStudent(st1);
        studGroup.addStudent(st3);

        studGroup.showGroup();
        System.out.println("------------------sortByName---------------------");
        studGroup.sortByName();
        studGroup.showGroup();
        System.out.println("------------------sortBySurName------------------");
        studGroup.sortBySurName();
        studGroup.showGroup();
        System.out.println("------------------sortByBirthDay-----------------");
        studGroup.sortByBirthDay();
        studGroup.showGroup();
        System.out.println("------------------searchByName-------------------");
        studGroup.searchByName("Jack");
        System.out.println("------------------searchBySurName----------------");
        studGroup.searchBySurName("Kenton");
        System.out.println("------------------delStudent---------------------");
        if (studGroup.delStudent(st1))
            System.out.println("Student - " + st1 + " was deleted");
        System.out.println("------------------showGroup---------------------");
        studGroup.showGroup();
    }
}
