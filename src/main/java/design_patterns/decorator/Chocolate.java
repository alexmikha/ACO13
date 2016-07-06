package  main.java.design_patterns.decorator;

/**
 * Created by gorobec on 26.06.16.
 */
public class Chocolate extends CondimentBeverage{
    public String desription = "Chocolate";
    public double cost = 8.14;
    Beverage beverage;

    public Chocolate(Beverage beverage) {
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
