package franxx.code.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        var pattern = "Hii {0}, Anda bisa mencari data anda dengan mengetikan \"{0}\" di pencarian";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[]{
                "Hilmi"
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundleId() {
        var locale = new Locale("id", "ID");
        var resource = ResourceBundle.getBundle("message", locale);

        var pattern = resource.getString("welcome.message");
        var message = new MessageFormat(pattern);

        var format = message.format(new Object[]{
                "Hilmi", "FranXX Code"
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        var resource = ResourceBundle.getBundle("message");

        var pattern = resource.getString("welcome.message");
        var message = new MessageFormat(pattern);

        var format = message.format(new Object[]{
                "Hilmi", "FranXX Code"
        });

        System.out.println(format);
    }
}
