package main.java.week5.clones;

/**
 * Created by mykhailov on 26.06.16.
 */
public class Woman extends Person {
    public Child child;

    public Woman(String name, int age, Child child) {
        super(name, age);
        this.child = child;
    }

    public Woman(String name, int age) {
        super(name, age);
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Woman{" + super.toString() +
                " child=" + child +
                '}';
    }
}
