package main.java.week5.string_builder;

import main.java.week5.time_counter.Action;
import main.java.week5.time_counter.TimeCounter;

/**
 * Created by mykhailov on 25.06.16.
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        /*TimeCounter countString = new TimeCounter();
        long time = countString.count(new Action() {
            @Override
            public void run() {
                String s = "";
                for (int i = 0; i < 100_000; i++) {
                    s += i;
                }
            }
        });
        System.out.println(time);*/

        TimeCounter countStringBuilder = new TimeCounter();
        long timeOfBuilder = countStringBuilder.count(new Action() {
            @Override
            public void run() {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < 1000_000_0; i++) {
                    builder.append(i);
                }
                builder.toString();
            }
        });
        System.out.println(timeOfBuilder);


    }
}
