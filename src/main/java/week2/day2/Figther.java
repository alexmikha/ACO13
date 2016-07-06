package main.java.week2.day2;

/**
 * Created by mykhailov on 01.06.2016.
 */
abstract class Fighter {
    public int health = 100;
    private String name;
    public int damage;

    public Fighter(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void hit(Fighter fighter);

    public String asString() {
        return name;
    }
}


