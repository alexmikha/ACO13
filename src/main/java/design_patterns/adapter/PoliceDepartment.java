package  main.java.design_patterns.adapter;

import main.java.design_patterns.adapter.Policeman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 25.06.16.
 */
public class PoliceDepartment {

    private List<Policeman> policemen;

    public PoliceDepartment(){
        policemen = new ArrayList<>();
    }

    public boolean addPoliceman(Policeman policeman){
        return policemen.add(policeman);
    }

    public void startWorkingDay(){
        for (Policeman policeman : policemen) {
            policeman.serve();
        }
    }

}
