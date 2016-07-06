package main.java.week2.day1.inheritens;

/**
 * Created by mykhailov on 31.05.2016.
 */
public class Junior extends Coder{

    public Junior(int age, String name, String surname, String prodrammingLanguage) {
        super(age, name, surname, prodrammingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I'm only trying to make art");
    }
}
