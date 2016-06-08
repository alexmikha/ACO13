package week1.day2.student;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", "Kenton", new MyDate(1989, 11, 16), 'M');
   //     Student st2 = new Student("Alex", "Kenton", new MyDate(1988, 14, 16), 'M');
        Student st2 = new Student("Jack", "Fisher", new MyDate(1988, 12, 17), 'M');
        Student st3 = new Student("Nik", "Evans", new MyDate(1988, 4, 15), 'M');

//  Student[] students = new Student[2];
//        students[0] = st2;
//        students[1] = st1;

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
        studGroup.delStudent(st1);
       if (false)
           System.out.println("Student - " + st1 + " was deleted");

//        System.out.println(Arrays.toString(students));
 //       System.out.println(st1.equals(st2));
 //       Arrays.sort(students);
 //       System.out.println(Arrays.toString(students));

//        Group aco13 = new Group("ACO13");
//        aco13.addStudent(st2);
//        aco13.addStudent(st1);
//        aco13.showGroup();
//        aco13.sort();
//        aco13.search("Alex");
//        aco13.delStudent(st2);
    }
}
