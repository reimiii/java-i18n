package franxx.code.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {
    @Test
    void testMessageFormatType() {
        var locale = new Locale("id", "ID");
        var resource = ResourceBundle.getBundle("message", locale);

        var pattern = resource.getString("status");
        var message = new MessageFormat(pattern, locale);

        var format = message.format(new Object[]{
                "Hilmi", new Date(), 1000000
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatTypeD() {
        var locale = new Locale("en", "US");
        var resource = ResourceBundle.getBundle("message", locale);

        var pattern = resource.getString("status");
        var message = new MessageFormat(pattern, locale);

        var format = message.format(new Object[]{
                "Hilmi", new Date(), 1000000
        });

        System.out.println(format);
    }
}
