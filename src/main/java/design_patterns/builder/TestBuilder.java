package  main.java.design_patterns.builder;

/**
 * Created by gorobec on 25.06.16.
 */
public class TestBuilder {
    public static void main(String[] args) {
        NutritionFacts bigMac = new NutritionFacts.Builder().
                addcalories(25).
                addcarbohydrates(36).
                addName("Burger").build();
    }
}
