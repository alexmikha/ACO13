package week2.day1.inheritens;

/**
 * Created by mykhailov on 28.05.2016.
 */
public class Coder extends Employee {
    private String prodrammingLanguage;

    public Coder(int age, String name, String surname, String prodrammingLanguage) {
        super(age, name, surname);
        this.prodrammingLanguage = prodrammingLanguage;
    }

    public String getProdrammingLanguage() {
        return prodrammingLanguage;
    }

    @Override
    public void work() {
        System.out.println("I'am making art");
    }


    protected void writeCode()  {
        System.out.println("codding");
    }

    public String asString(){
       return String.format("%s, language -%s", super.asString(), prodrammingLanguage);
    }

}
