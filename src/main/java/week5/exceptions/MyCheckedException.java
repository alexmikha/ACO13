package main.java.week5.exceptions;

/**
 * Created by mykhailov on 25.06.16.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
