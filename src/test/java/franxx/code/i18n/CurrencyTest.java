package franxx.code.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyId() {
        var indonesia = new Locale("id", "ID");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUs() {
        var usa = new Locale("en", "US");
        var currency = Currency.getInstance(usa);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(usa));
    }

    @Test
    void testNumberFormatCurrencyId() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(1000000.333);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseId() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var parse = numberFormat.parse("Rp900.000,25").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
