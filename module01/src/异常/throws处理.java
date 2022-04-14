package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class throws处理 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            methods();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");

    }

    private static void methods() throws ParseException {
        String s="2022-03-14";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date d =sdf.parse(s);
        System.out.println(d);
    }
}
