package main.java.week2.day2;

/**
 * Created by mykhailov on 29.05.2016.
 */
public class LukKang extends Fighter{

    public LukKang(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage;
        System.out.println(fighter.health);
    }
}
