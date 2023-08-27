package franxx.code.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    @Test
    void testResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
        // deprecated
    void testResourceBundleIdDeprecated() {
        Locale id = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", id);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIdNew() {
        Locale id = new Locale
                .Builder()
                .setLanguage("id")
                .setRegion("ID")
                .build();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", id);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound() {
        Locale id = new Locale
                .Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", id);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleMultipleTime() {
        Locale id = new Locale
                .Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("message", id);
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("message", id);

        System.out.println(resourceBundle1 == resourceBundle2);
    }
}
