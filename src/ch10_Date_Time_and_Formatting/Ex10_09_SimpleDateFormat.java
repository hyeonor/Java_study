package ch10_Date_Time_and_Formatting;

import java.util.*;
import java.text.*;

class Ex10_09_SimpleDateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2019년 11월 23일"); // 문자열 -> 날짜
            System.out.println(df2.format(d));          // 날짜 -> 문자열
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
