package main.java.week3.day2.state;

/**
 * Created by gorobec on 05.06.16.
 */
public class CoffeeMachine implements State{

    private State noMoney;
    private State makeChoice;
    private State outOfOrder;
    private State inProcess;


    private State currentState;

    private int coffeePrice;


    public CoffeeMachine(){
        this.noMoney = new NoMoneyState(this);
        this.makeChoice = new MakeChoiseState(this);
        this.outOfOrder = new OutOfOrderState(this);
        this.inProcess = new InProcessState(this);

        currentState = noMoney;

        coffeePrice = 15;

    }

    @Override
    public void moneyIn() {
        currentState.moneyIn();
    }

    @Override
    public void makeChoice() {
        currentState.makeChoice();
    }

    @Override
    public void makeDrink() {
        currentState.makeDrink();

    }

    @Override
    public void cancel() {
        currentState.makeChoice();
    }

    @Override
    public void giveMoney() {
        currentState.giveMoney();
    }


    public State getCurrentState(){
        return currentState;
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }


    public State getNoMoney() {
        return noMoney;
    }

    public State getMakeChoice() {
        return makeChoice;
    }

    public State getOutOfOrder() {
        return outOfOrder;
    }

    public State getInProcess() {
        return inProcess;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }
}
