package CodeSmells.Lab5.Part1.Task7;

import java.util.Calendar;

public class Client {
    public boolean isWeekend(Calendar date) {
        return DateUtils.isWeekend(date);
    }

    public void doSomething() {
        Calendar currentDate = Calendar.getInstance();
        if (isWeekend(currentDate)) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's not weekend!");
        }
    }
}