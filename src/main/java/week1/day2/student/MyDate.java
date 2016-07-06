package main.java.week1.day2.student;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class MyDate implements Comparable {

    private int yearsBirth;
    private int monthBirth;
    private int dayBirth;

    public MyDate(int yearsBirth, int monthBirth, int dayBirth) {
        this.yearsBirth = yearsBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    public int getYearsBirth() {
        return yearsBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (yearsBirth != myDate.yearsBirth) return false;
        if (monthBirth != myDate.monthBirth) return false;
        return dayBirth == myDate.dayBirth;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o != null && o instanceof Student) {
            MyDate myDate = (MyDate) o;
            if (yearsBirth != myDate.yearsBirth) {
                return yearsBirth - myDate.yearsBirth;
            } else if (monthBirth != myDate.monthBirth) {
                return monthBirth - myDate.monthBirth;
            } else if (dayBirth != myDate.dayBirth)
                return dayBirth - myDate.dayBirth;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", dayBirth, monthBirth, yearsBirth);
    }
}