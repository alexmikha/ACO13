package main.java.week5.clones;

import java.io.*;

/**
 * Created by mykhailov on 26.06.16.
 */
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Child child = new Child("Ivasut", 12);
        Woman woman = new Woman("Anna", 35, child);
        Man person = new Man("Vasja", 45, woman);


        ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(
                                "/home/gorobec/Java/development/Teaching/ArtCode/ACO13/src/resources/Man.txt")));

        oos.writeObject(person);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                "/home/gorobec/Java/development/Teaching/ArtCode/ACO13/src/resources/Man.txt")));
        Man clone = (Man)ois.readObject();
        ois.close();

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
