package ch10_Date_Time_and_Formatting;

import java.util.Calendar;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));
    }

    static int getDayDiff(String date1, String date2) {
        int diff = 0;

        try {
            int year1 = Integer.parseInt(date1.substring(0, 4));
            int month1 = Integer.parseInt(date1.substring(4, 6)) - 1;
            int day1 = Integer.parseInt(date1.substring(6, 8));
            int year2 = Integer.parseInt(date2.substring(0, 4));
            int month2 = Integer.parseInt(date2.substring(4, 6)) - 1;
            int day2 = Integer.parseInt(date2.substring(6, 8));

            Calendar Calendar1 = Calendar.getInstance();
            Calendar Calendar2 = Calendar.getInstance();

            Calendar1.clear();
            Calendar2.clear();

            Calendar1.set(year1, month1, day1);
            Calendar2.set(year2, month2, day2);

            diff = (int) ((Calendar1.getTimeInMillis() - Calendar2.getTimeInMillis())) / (24 * 60 * 60 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return diff;
    }
}
