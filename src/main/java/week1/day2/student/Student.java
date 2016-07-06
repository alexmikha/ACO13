package main.java.week1.day2.student;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class Student implements Comparable {

    private String name;
    private String surname;
    private MyDate birthDay;
    private double averageMark;
    private char gender;

    public Student(String name, String surname, MyDate birthDay, char gender) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Student)) return false;
        Student tmp = (Student) o;
        return this.name.equals(tmp.name) && this.surname.equals(tmp.surname)
                && this.birthDay.equals(tmp.birthDay);
    }


    @Override
    public int compareTo(Object o) {

        if (this == o) return 0;
        if (o != null && o instanceof Student) {
            Student tmp = (Student) o;
            if (!this.name.equals(tmp.name)) {
                return this.name.compareTo(tmp.name);
            }
            if (!this.surname.equals(tmp.surname)) {
                return this.surname.compareTo(tmp.surname);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%2$s, %3$s, BD - %1$s, gender - %4$s",
                birthDay.toString(), name, surname, gender);
    }

}
