package franxx.code.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testLocaleDeprecated() {
        String language = "id";
        String country = "ID";

        // Deprecated
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleId() {
        Locale locale = new Locale
                .Builder()
                .setLanguage("id")
                .setRegion("ID")
                .build();

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println("Display: " + locale.getDisplayLanguage());
        System.out.println("Display: " + locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUs() {
        Locale locale = new Locale
                .Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println("Display: " + locale.getDisplayLanguage());
        System.out.println("Display: " + locale.getDisplayCountry());
    }
}
