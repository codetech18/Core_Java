package Localization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocalExample {
    public static void main(String[] args) {
        long num = 5000000;
        NumberFormat format = NumberFormat.getInstance();
//        System.out.println(num + " is of Type " + ((Object)num).getClass().getSimpleName());
        System.out.println(format.format(num));

        NumberFormat numberFormatLocal = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(numberFormatLocal.format(num));

        DateFormat format1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
        System.out.println(format1.format(new Date()));

        NumberFormat numbercode = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numbercode.getCurrency() +" " + numbercode.getCurrency().getDisplayName());
    }
}
