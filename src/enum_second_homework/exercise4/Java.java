package enum_second_homework.exercise4;

import java.util.Scanner;

public class Java {
    /**
     * Ex.4
     */
    void weekendOrWeekday() {
        Scanner sc = new Scanner(System.in);
        String weekDay = sc.next();
        weekDay = weekDay.toUpperCase();

        if (weekDay.equals(DaysOfWeek.SUNDAY.name()) || weekDay.equals(DaysOfWeek.SATURDAY.name())) {
            System.out.println("true");

        } else System.out.println("false");
    }
}
