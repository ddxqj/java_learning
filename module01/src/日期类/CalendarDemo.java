package 日期类;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        now.set(2022,2,1);
        now.add(Calendar.DAY_OF_MONTH,-1);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + (month + 1) + "月" + day + "日");
    }
}
