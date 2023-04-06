package ch10_Date_Time_and_Formatting;

import java.util.Calendar;

class Ex10_4_Calendar_add_roll {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2023, 7, 31); // 2023년 8월 31일

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        // add()와 달리 roll()은 다른 필드에 영향을 주지 않는다.
        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1)
                + "월 " + date.get(Calendar.DATE) + "일";
    }
}
