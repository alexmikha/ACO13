package main.java.week3.day2;

/**
 * Created by mykhailov on 05.06.16.
 */
public class Singleton {

    public static volatile Singleton INSTANCE;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
