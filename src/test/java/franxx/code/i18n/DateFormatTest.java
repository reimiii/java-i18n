package franxx.code.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDataFormatId() {
        var pattern = "EEEE dd MMMM yyyy";
        var id = new Locale
                .Builder()
                .setLanguage("id")
                .setRegion("ID")
                .build();
        var dateFormat = new SimpleDateFormat(pattern, id);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDataFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale
                .Builder()
                .setLanguage("ja")
                .setRegion("JP")
                .build();
        var dateFormat = new SimpleDateFormat(pattern, japan);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDataFormatParseId() {
        var pattern = "EEEE dd MMMM yyyy";
        var id = new Locale
                .Builder()
                .setLanguage("id")
                .setRegion("ID")
                .build();
        var dateFormat = new SimpleDateFormat(pattern, id);

        try {
            var parse = dateFormat.parse("Minggu 27 Agustus 2023");
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testDataFormatParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale
                .Builder()
                .setLanguage("ja")
                .setRegion("JP")
                .build();
        var dateFormat = new SimpleDateFormat(pattern, japan);

        try {
            var parse = dateFormat.parse("日曜日 27 8月 2023");
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
