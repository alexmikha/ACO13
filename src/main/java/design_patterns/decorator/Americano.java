package  main.java.design_patterns.decorator;

/**
 * Created by gorobec on 26.06.16.
 */
public class Americano extends Beverage{


    public String getDescription(){
        return "Americano";
    }
    @Override
    public double cost() {
        return 15.50;
    }
}
