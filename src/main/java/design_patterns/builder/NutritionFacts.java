package  main.java.design_patterns.builder;

/**
 * Created by gorobec on 25.06.16.
 */
public class NutritionFacts {
    private final String name;
    private final int calories;
    private final int fats;
    private final int carbohydrates;
    private final int proteins;
    private final int vitamins;
    private final int e;


    public static class Builder{
        private String name;
        private int calories;
        private int fats;
        private int carbohydrates;
        private int proteins;
        private int vitamins;
        private int e;


        public Builder addName(String name){
            this.name = name;
            return this;
        }
        public Builder addcalories(int calories){
            this.calories = calories;
            return this;
        }
        public Builder addfats(int fats){
            this.fats = fats;
            return this;
        }
        public Builder addcarbohydrates(int carbohydrates){
            this.carbohydrates = carbohydrates;
            return this;
        }
        public Builder addproteins(int proteins){
            this.proteins = proteins;
            return this;
        }
        public Builder addvitamins(int vitamins){
            this.vitamins = vitamins;
            return this;
        }
        public Builder addE (int e){
            this.e = e;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }


    private NutritionFacts(Builder builder){
        this.name = builder.name;
       this.calories = builder.calories;
       this.fats = builder.fats;
       this.carbohydrates = builder.carbohydrates;
       this.proteins = builder.proteins;
       this.vitamins = builder.vitamins;
       this.e = builder.e;

    }

}
