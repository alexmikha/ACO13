package main.java.design_patterns.adapter;

/**
 * Created by gorobec on 25.06.16.
 */
public class PolicemanAdapter extends Policeman{

    private Militioner militioner;

    public PolicemanAdapter(Militioner militioner){
        this.militioner = militioner;
    }

    @Override
    public void serve() {
        militioner.takeBribes();
    }
}
