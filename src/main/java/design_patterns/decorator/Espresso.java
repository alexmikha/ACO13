package  main.java.design_patterns.decorator;

/**
 * Created by gorobec on 26.06.16.
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
