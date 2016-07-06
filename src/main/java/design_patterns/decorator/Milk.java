package  main.java.design_patterns.decorator;

/**
 * Created by gorobec on 26.06.16.
 */
public class Milk extends CondimentBeverage {

    public String desription = "Milk";
    public double cost = 5.54;
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + desription;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }
}
