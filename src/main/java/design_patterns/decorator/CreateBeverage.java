package  main.java.design_patterns.decorator;

/**
 * Created by gorobec on 26.06.16.
 */
public class CreateBeverage {
    public static void main(String[] args) {

        Beverage chocolate = new Chocolate(new Milk(new Espresso()));
        System.out.println(chocolate.getDescription());
        System.out.println(chocolate.cost());

    }
}
