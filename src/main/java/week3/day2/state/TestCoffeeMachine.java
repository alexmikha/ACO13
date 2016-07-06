package main.java.week3.day2.state;

/**
 * Created by gorobec on 05.06.16.
 */
public class TestCoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();


        coffeeMachine.makeDrink();
        coffeeMachine.moneyIn();
        coffeeMachine.makeChoice();
        coffeeMachine.moneyIn();
        coffeeMachine.makeChoice();
        coffeeMachine.giveMoney();
//        coffeeMachine.makeDrink();
    }
}
