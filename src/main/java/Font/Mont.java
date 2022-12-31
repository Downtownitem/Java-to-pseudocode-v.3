package Font;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Mont {

    private static final String FONT_ROUTE = "src/main/resources/Fonts/";

    public static Font getFont(String style, int size) {
        String route = switch (style.toLowerCase()) {
            case "black" -> FONT_ROUTE + "Mont-Black.ttf";
            case "blackitalic" -> FONT_ROUTE + "Mont-BlackItalic.ttf";
            case "bold" -> FONT_ROUTE + "Mont-Bold.ttf";
            case "bolditalic" -> FONT_ROUTE + "Mont-BoldItalic.ttf";
            case "extralight" -> FONT_ROUTE + "Mont-ExtraLight.ttf";
            case "extralightitalic" -> FONT_ROUTE + "Mont-ExtraLightItalic.ttf";
            case "heavy" -> FONT_ROUTE + "Mont-Heavy.ttf";
            case "heavyitalic" -> FONT_ROUTE + "Mont-HeavyItalic.ttf";
            case "light" -> FONT_ROUTE + "Mont-Light.ttf";
            case "lightitalic" -> FONT_ROUTE + "Mont-LightItalic.ttf";
            case "regular" -> FONT_ROUTE + "Mont-Regular.ttf";
            case "regularitalic" -> FONT_ROUTE + "Mont-RegularItalic.ttf";
            case "semibold" -> FONT_ROUTE + "Mont-SemiBold.ttf";
            case "semibolditalic" -> FONT_ROUTE + "Mont-SemiBoldItalic.ttf";
            case "thin" -> FONT_ROUTE + "Mont-Thin.ttf";
            case "thinitalic" -> FONT_ROUTE + "Mont-ThinItalic.ttf";
            default -> FONT_ROUTE + "Mont-Regular.ttf";
        };

        Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(route)).deriveFont(Font.PLAIN, size);;
        } catch (IOException | FontFormatException e) {
            System.out.println("Font error in Mont");
            font = new Font("Montserrat", Font.PLAIN, size);
        }

        return font;
    }

}
