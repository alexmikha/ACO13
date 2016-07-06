package main.java.week5.clones;

/**
 * Created by mykhailov on 26.06.16.
 */
public class Man extends Person {
    public Woman wife;
    public Man(String name, int age) {
        super(name, age);
    }

    public Man(String name, int age, Woman wife) {
        super(name, age);
        this.wife = wife;
    }

    public Man(Man man) {
        this(man.name, man.age, man.wife);
    }



    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Man{" + super.toString() +
                " wife=" + wife +
                '}';
    }

    @Override
    public Man clone() throws CloneNotSupportedException {
        Man toReturn = (Man)super.clone();
        toReturn.setWife((Woman)getWife().clone());
        return toReturn;
    }
}
