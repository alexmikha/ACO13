package main.java.week5.string_builder;

import main.java.week5.time_counter.Action;
import main.java.week5.time_counter.TimeCounter;

/**
 * Created by mykhailov on 26.06.16.
 */
public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();


        TimeCounter sbCount = new TimeCounter();
        TimeCounter sbfCount = new TimeCounter();
        long sbTime = sbCount.count(new Action() {
            @Override
            public void run() {
                for (int i = 0; i < 1000_000_0; i++) {
                    sb.append(i);
                }
            }
        });
        long sbfTime = sbfCount.count(new Action() {
            @Override
            public void run() {
                for (int i = 0; i < 1000_000_0; i++) {
                    sbf.append(i);
                }
            }
        });

        System.out.printf("SB time - %d\n SBF time - %d\n", sbTime, sbfTime);

    }
}
