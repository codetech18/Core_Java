package Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args) {
        double num = 1323.526;
        Locale l = new Locale("en", "NG");
        NumberFormat Naira = NumberFormat.getCurrencyInstance(l);
        System.out.println("Naira: " + Naira.format(num));

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("de","DE"));
        String Currency = numberFormat.format(100000);
        System.out.println(Currency);

    }
}
