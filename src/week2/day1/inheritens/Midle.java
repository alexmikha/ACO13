package week2.day1.inheritens;

/**
 * Created by mykhailov on 31.05.2016.
 */
public class Midle extends Coder {
    public Midle(int age, String name, String surname, String prodrammingLanguage) {
        super(age, name, surname, prodrammingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I'm can make art better than junior");
    }
}
