package week1.day1;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class Test {

    public static void main(String[] args) {
 //       Human person = new Human();
        Human person = new Human("Kolya", 25, "M", 180, 85);

      //  person.init("Vasja", 25, "M", 180, 185);
/*        String persoInfo = person.asString();
        System.out.println(persoInfo);*/

        System.out.println(person.asString());

        person.setName("Vasja");
        System.out.println(person.asString());
    }
}
