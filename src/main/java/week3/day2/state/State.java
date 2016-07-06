package main.java.week3.day2.state;

/**
 * Created by gorobec on 05.06.16.
 */
public interface State {
    void moneyIn();
    void makeChoice();
    void makeDrink();
    void cancel();
    void giveMoney();
}
