package  main.java.design_patterns.adapter;
//package design_patterns.adapter;

/**
 * Created by gorobec on 25.06.16.
 */
public class ACAB {
    public static void main(String[] args) {
        PoliceDepartment department = new PoliceDepartment();

        department.addPoliceman(new Policeman());
        department.addPoliceman(new Policeman());
        department.addPoliceman(new Policeman());
        department.addPoliceman(new Policeman());
        department.addPoliceman(new PolicemanAdapter(new Militioner()));
        department.startWorkingDay();

    }
}
