package main.java.week2.day2.interfaces;

/**
 * Created by mykhailov on 01.06.2016.
 */
public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I can swim, I'm fish");
    }
}