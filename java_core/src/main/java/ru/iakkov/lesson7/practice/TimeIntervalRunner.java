package ru.iakkov.lesson7.practice;

import java.sql.Time;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = createTimeInterval();
        System.out.println(timeInterval.totalSeconds());
        //TimeInterval timeInterval = new TimeInterval(30, 2, 0);
        //System.out.println(timeInterval.totalSeconds());

        //TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        //System.out.println(timeInterval1.totalSeconds());

    }
    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
