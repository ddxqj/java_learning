package 日期类;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d =new Date();
        //SimpleDateFormat sdf =new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);

        String ss="2022/3/10  20:25:00";
        d=sdf.parse(ss);
        System.out.println(d);
    }
}
