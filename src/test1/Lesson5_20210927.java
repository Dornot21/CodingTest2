package test1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Lesson5_20210927 {
    public static void main(String[] args) {



        String result = solution(5, 24);
        System.out.println(result);
    }
    public static String solution(int a, int b){
        LocalDate date = LocalDate.of(2016, a, b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();

        String[] days = {"MON","TUE","WED","THU","FRI","SAT", "SUN"};

        return days[dayOfWeekNumber-1];
    }
}
