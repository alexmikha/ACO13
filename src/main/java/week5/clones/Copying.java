package main.java.week5.clones;

/**
 * Created by mykhailov on 26.06.16.
 */
public class Copying {
    public static void main(String[] args) throws CloneNotSupportedException {
        Child child = new Child("Ivasut", 12);
        Woman woman = new Woman("Anna", 35, child);
        Man person = new Man("Vasja", 45, woman);
        Man clone = person.clone();

        System.out.println(person);
        System.out.println(clone);
        person.setAge(35);
        person.getWife().setAge(25);
        person.getWife().getChild().setAge(10);
        System.out.println("---------After change---------");

        System.out.println(person);
        System.out.println(clone);
    }
}
