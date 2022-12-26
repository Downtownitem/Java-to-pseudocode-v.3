package Custom;

import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class UltraButton extends JButton {

    // Color State for color gradient
    enum State {
        NORMAL, HOVER, PRESSED
    }

    // Variable Declaration
    private int radius = 10;
    private BufferedImage imageShadow;
    private final Insets shadowSize = new Insets(2, 5, 8, 5);
    private final CustomButtonRippleEffect rippleEffect = new CustomButtonRippleEffect(this);
    private boolean over;
    private Color color1Background = getBackground();
    private Color color1Foreground = getForeground();
    private Color color2Over = new Color(0, 0, 0);
    private Color color2OverForeground = new Color(0, 0, 0);
    private Color color3Click = new Color(0, 0, 0);
    private Color color3ClickForeground = new Color(0, 0, 0);
    private Color color4Border = new Color(0, 0, 0);
    private Color color5Shadow = new Color(0, 0, 0);
    private int borderLength = 2;
    private boolean enableBorder;
    private boolean enableShadow;
    private boolean enableRippleEffect;
    private boolean enableCustomBorders;
    private boolean enableColorGradient;
    private int roundTopLeft = 1;
    private int roundTopRight = 1;
    private int roundBottomLeft = 1;
    private int roundBottomRight = 1;
    private State state;
    private final RenderingHints hints;
    private Color actualGradiantColor = color1Background;
    private Color actualGradiantColorForeground = color1Foreground;
    private int changeCoefficient = 8;

    Timer timer = new Timer(1, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            changeActualColor();
            repaint();
        }
    });
    // End of Variable Declaration

    // Setters and Getters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        createImageShadow();
        repaint();
    }

    public Color getColor5Shadow() {
        return color5Shadow;
    }

    public void setColor5Shadow(Color color5Shadow) {
        this.color5Shadow = color5Shadow;
        createImageShadow();
        repaint();
    }

    public void setRippleColor(Color color) {
        rippleEffect.setRippleColor(color);
    }

    public Color getRippleColor() {
        return rippleEffect.getRippleColor();
    }

    public Color getColor1Background() {
        return color1Background;
    }

    public void setColor1Background(Color color1Background) {
        this.color1Background = color1Background;
        setBackground(color1Background);
        first = true;
    }

    public Color getColor2Over() {
        return color2Over;
    }

    public void setColor2Over(Color color2Over) {
        this.color2Over = color2Over;
        first = true;
    }

    public Color getColor3Click() {
        return color3Click;
    }

    public void setColor3Click(Color color3Click) {
        this.color3Click = color3Click;
        first = true;
    }

    public Color getColor4Border() {
        return color4Border;
    }

    public void setColor4Border(Color color4Border) {
        this.color4Border = color4Border;
        first = true;
    }

    public boolean isEnableBorder() {
        return enableBorder;
    }

    public void setEnableBorder(boolean enableBorder) {
        this.enableBorder = enableBorder;
        repaint();
    }

    public boolean isEnableShadow() {
        return enableShadow;
    }

    public void setEnableShadow(boolean enableShadow) {
        this.enableShadow = enableShadow;
        repaint();
    }

    public boolean isEnableRippleEffect() {
        return enableRippleEffect;
    }

    public void setEnableRippleEffect(boolean enableRippleEffect) {
        this.enableRippleEffect = enableRippleEffect;
        repaint();
    }

    public int getBorderLength() {
        return borderLength;
    }

    public void setBorderLength(int borderLength) {
        this.borderLength = borderLength;
        repaint();
    }

    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    public int getRoundTopRight() {
        return roundTopRight;
    }

    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }

    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint();
    }

    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint();
    }

    public boolean isEnableCustomBorders() {
        return enableCustomBorders;
    }

    public void setEnableCustomBorders(boolean enableCustomBorders) {
        this.enableCustomBorders = enableCustomBorders;
        repaint();
    }

    public int getChangeCoefficient() {
        return changeCoefficient;
    }

    public void setChangeCoefficient(int changeCoefficient) {
        this.changeCoefficient = changeCoefficient;
    }

    public boolean isEnableColorGradient() {
        return enableColorGradient;
    }

    public void setEnableColorGradient(boolean enableColorGradient) {
        this.enableColorGradient = enableColorGradient;
        repaint();
    }

    public Color getColor1Foreground() {
        return color1Foreground;
    }

    public void setColor1Foreground(Color color1Foreground) {
        this.color1Foreground = color1Foreground;
        setForeground(color1Foreground);
        first = true;
    }

    public Color getColor2OverForeground() {
        return color2OverForeground;
    }

    public void setColor2OverForeground(Color color2OverForeground) {
        this.color2OverForeground = color2OverForeground;
        first = true;
    }

    public Color getColor3ClickForeground() {
        return color3ClickForeground;
    }

    public void setColor3ClickForeground(Color color3ClickForeground) {
        this.color3ClickForeground = color3ClickForeground;
        first = true;
    }
    // End of Setters and Getters

    public UltraButton() {
        hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        setFocusPainted(false);

        setContentAreaFilled(false);
        rippleEffect.setRippleColor(new Color(220, 220, 220));

        setColor1Background(getBackground());
        color2Over = new Color(179, 250, 160);
        color3Click = new Color(152, 184, 144);
        actualGradiantColor = color1Background;
        actualGradiantColorForeground = color1Foreground;
        setForeground(color1Foreground);

        //  Add event mouse
        timer.start();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                state = State.HOVER;
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                state = State.NORMAL;
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                state = State.PRESSED;
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    state = State.HOVER;
                } else {
                    state = State.NORMAL;
                }
            }
        });
    }

    private boolean first = true;

    @Override
    protected void paintComponent(Graphics grphcs) {
        // Graphics2D setup
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHints(hints);

        if (first) {
            actualGradiantColor = color1Background;
            actualGradiantColorForeground = color1Foreground;
            first = false;
        }

        double width = getWidth();
        double height = getHeight();
        double x = 0;
        double y = 0;

        // Enable Shadow
        if (enableShadow) {
            // Draw Shadow
            setBorder(new EmptyBorder(10, 12, 15, 12));
            width = getWidth() - (shadowSize.left + shadowSize.right);
            height = getHeight() - (shadowSize.top + shadowSize.bottom);
            x = shadowSize.left;
            y = shadowSize.top;

            //  Create Shadow Image
            g2.drawImage(imageShadow, 0, 0, null);
        } else {
            setBorder(new EmptyBorder(0, 0, 0, 0));
        }

        //  Create Background Color
        Area area;
        if (enableBorder) {
            // Draw Border
            g2.setColor(color4Border);
            Area borderArea;
            if (enableCustomBorders) {
                borderArea = createCustomRectangle((int) width, (int) height, (int) x, (int) y);
            } else {
                borderArea = new Area(new RoundRectangle2D.Double(x, y, width, height, radius, radius));
            }
            g2.fill(borderArea);

            // Draw Background
            g2.setColor(actualGradiantColor);
            if (enableCustomBorders) {
                area = createCustomRectangle((int) width - borderLength * 2, (int) height - borderLength * 2, (int) x + borderLength, (int) y + borderLength);
            } else {
                area = new Area(new RoundRectangle2D.Double(x + borderLength, y + borderLength, width - borderLength * 2, height - borderLength * 2, radius, radius));
            }

        } else {
            // Draw Background
            g2.setColor(actualGradiantColor);
            if (enableCustomBorders) {
                area = createCustomRectangle((int) width, (int) height, (int) x, (int) y);
            } else {
                area = new Area(new RoundRectangle2D.Double(x, y, width, height, radius, radius));
            }
        }
        g2.fill(area);

        // Enable Ripple Effect
        if (enableRippleEffect) {
            rippleEffect.reder(grphcs, area);
        }

        setForeground(actualGradiantColorForeground);

        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createImageShadow();
    }

    private void createImageShadow() {
        int height = getHeight();
        int width = getWidth();
        if (width > 0 && height > 0) {
            imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = imageShadow.createGraphics();
            g2.drawImage(createShadow(), 0, 0, null);
            g2.dispose();
        }
    }

    private BufferedImage createShadow() {
        int width = getWidth() - (shadowSize.left + shadowSize.right);
        int height = getHeight() - (shadowSize.top + shadowSize.bottom);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, radius, radius));
        g2.dispose();
        return new CustomButtonShadowRenderer(5, 0.3f, color5Shadow).createShadow(img);
    }

    private Shape createRoundTopLeft(int width, int height, double x, double y) {
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, y, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(x, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundTopRight(int width, int height, double x, double y) {
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(x, y, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(x, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomLeft(int width, int height, double x, double y) {
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, y, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(x, y, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomRight(int width, int height, double x, double y) {
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(x, y, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(x, y, width, height - roundY / 2)));
        return area;
    }

    private Area createCustomRectangle(int width, int height, int x, int y) {
        Area area = new Area(createRoundTopLeft(width, height, x, y));
        if (roundTopRight > 0) {
            area.intersect(new Area(createRoundTopRight(width, height, x, y)));
        }
        if (roundBottomLeft > 0) {
            area.intersect(new Area(createRoundBottomLeft(width, height, x, y)));
        }
        if (roundBottomRight > 0) {
            area.intersect(new Area(createRoundBottomRight(width, height, x, y)));
        }
        return area;
    }

    private void changeActualColor() {
        if (state == State.NORMAL) {
            if (enableColorGradient) {
                actualGradiantColor = changeColorOnce(actualGradiantColor, color1Background);
                actualGradiantColorForeground = changeColorOnce(actualGradiantColorForeground, color1Foreground);
            } else {
                actualGradiantColor = color1Background;
                actualGradiantColorForeground = color1Foreground;
            }
        } else if (state == State.HOVER) {
            if (enableColorGradient) {
                actualGradiantColor = changeColorOnce(actualGradiantColor, color2Over);
                actualGradiantColorForeground = changeColorOnce(actualGradiantColorForeground, color2OverForeground);
            } else {
                actualGradiantColor = color2Over;
                actualGradiantColorForeground = color2OverForeground;
            }
        } else if (state == State.PRESSED) {
            if (enableColorGradient) {
                actualGradiantColor = changeColorOnce(actualGradiantColor, color3Click);
                actualGradiantColorForeground = changeColorOnce(actualGradiantColorForeground, color3ClickForeground);
            } else {
                actualGradiantColor = color3Click;
                actualGradiantColorForeground = color3ClickForeground;
            }
        }
    }

    public Color changeColorOnce(Color from, Color to) {
        int ci1 = from.getRed(), ci2 = from.getGreen(), ci3 = from.getBlue(), ci4 = from.getAlpha();
        int cf1 = to.getRed(), cf2 = to.getGreen(), cf3 = to.getBlue(), cf4 = to.getAlpha();

        // Red Color
        ci1 = getCi1(ci1, cf1);

        // Green Color
        ci2 = getCi1(ci2, cf2);

        // Blue Color
        ci3 = getCi1(ci3, cf3);

        // Alpha Color
        ci4 = getCi1(ci4, cf4);

        return new Color(ci1, ci2, ci3, ci4);
    }

    private int getCi1(int ci1, int cf1) {
        if (Math.abs(ci1 - cf1) <= changeCoefficient) {
            ci1 = cf1;
        } else if (ci1 < cf1) {
            ci1 += changeCoefficient;
        } else if (ci1 > cf1) {
            ci1 -= changeCoefficient;
        }
        if (ci1 > 255) {
            ci1 = 255;
        } else if (ci1 < 0) {
            ci1 = 0;
        }
        return ci1;
    }

}

class CustomButtonShadowRenderer {

    private int size = 5;
    private float opacity = 0.5f;
    private Color color = Color.BLACK;

    public CustomButtonShadowRenderer() {
        this(5, 0.5f, Color.BLACK);
    }

    public CustomButtonShadowRenderer(final int size, final float opacity, final Color color) {
        this.size = size;
        this.opacity = opacity;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public float getOpacity() {
        return opacity;
    }

    public int getSize() {
        return size;
    }

    public BufferedImage createShadow(final BufferedImage image) {
        int shadowSize = size * 2;
        int srcWidth = image.getWidth();
        int srcHeight = image.getHeight();
        int dstWidth = srcWidth + shadowSize;
        int dstHeight = srcHeight + shadowSize;
        int left = size;
        int right = shadowSize - left;
        int yStop = dstHeight - right;
        int shadowRgb = color.getRGB() & 0x00FFFFFF;
        int[] aHistory = new int[shadowSize];
        int historyIdx;
        int aSum;
        BufferedImage dst = new BufferedImage(dstWidth, dstHeight, BufferedImage.TYPE_INT_ARGB);
        int[] dstBuffer = new int[dstWidth * dstHeight];
        int[] srcBuffer = new int[srcWidth * srcHeight];
        CustomButtonGraphicsUtilities.getPixels(image, 0, 0, srcWidth, srcHeight, srcBuffer);
        int lastPixelOffset = right * dstWidth;
        float hSumDivider = 1.0f / shadowSize;
        float vSumDivider = opacity / shadowSize;
        int[] hSumLookup = new int[256 * shadowSize];
        for (int i = 0; i < hSumLookup.length; i++) {
            hSumLookup[i] = (int) (i * hSumDivider);
        }
        int[] vSumLookup = new int[256 * shadowSize];
        for (int i = 0; i < vSumLookup.length; i++) {
            vSumLookup[i] = (int) (i * vSumDivider);
        }
        int srcOffset;
        for (int srcY = 0, dstOffset = left * dstWidth; srcY < srcHeight; srcY++) {
            for (historyIdx = 0; historyIdx < shadowSize; ) {
                aHistory[historyIdx++] = 0;
            }
            aSum = 0;
            historyIdx = 0;
            srcOffset = srcY * srcWidth;
            for (int srcX = 0; srcX < srcWidth; srcX++) {
                int a = hSumLookup[aSum];
                dstBuffer[dstOffset++] = a << 24;
                aSum -= aHistory[historyIdx];
                a = srcBuffer[srcOffset + srcX] >>> 24;
                aHistory[historyIdx] = a;
                aSum += a;
                if (++historyIdx >= shadowSize) {
                    historyIdx -= shadowSize;
                }
            }
            for (int i = 0; i < shadowSize; i++) {
                int a = hSumLookup[aSum];
                dstBuffer[dstOffset++] = a << 24;
                aSum -= aHistory[historyIdx];
                if (++historyIdx >= shadowSize) {
                    historyIdx -= shadowSize;
                }
            }
        }

        for (int x = 0, bufferOffset = 0; x < dstWidth; x++, bufferOffset = x) {
            aSum = 0;
            for (historyIdx = 0; historyIdx < left; ) {
                aHistory[historyIdx++] = 0;
            }
            for (int y = 0; y < right; y++, bufferOffset += dstWidth) {
                int a = dstBuffer[bufferOffset] >>> 24;
                aHistory[historyIdx++] = a;
                aSum += a;
            }
            bufferOffset = x;
            historyIdx = 0;
            for (int y = 0; y < yStop; y++, bufferOffset += dstWidth) {
                int a = vSumLookup[aSum];
                dstBuffer[bufferOffset] = a << 24 | shadowRgb;
                aSum -= aHistory[historyIdx];
                a = dstBuffer[bufferOffset + lastPixelOffset] >>> 24;
                aHistory[historyIdx] = a;
                aSum += a;
                if (++historyIdx >= shadowSize) {
                    historyIdx -= shadowSize;
                }
            }
            for (int y = yStop; y < dstHeight; y++, bufferOffset += dstWidth) {
                int a = vSumLookup[aSum];
                dstBuffer[bufferOffset] = a << 24 | shadowRgb;
                aSum -= aHistory[historyIdx];
                if (++historyIdx >= shadowSize) {
                    historyIdx -= shadowSize;
                }
            }
        }
        CustomButtonGraphicsUtilities.setPixels(dst, 0, 0, dstWidth, dstHeight, dstBuffer);
        return dst;
    }
}

class CustomButtonGraphicsUtilities {

    private CustomButtonGraphicsUtilities() {
    }

    // Returns the graphics configuration for the primary screen
    private static GraphicsConfiguration getGraphicsConfiguration() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
    }

    public static BufferedImage createColorModelCompatibleImage(BufferedImage image) {
        ColorModel cm = image.getColorModel();
        return new BufferedImage(cm, cm.createCompatibleWritableRaster(image.getWidth(), image.getHeight()), cm.isAlphaPremultiplied(), null);
    }

    public static BufferedImage createCompatibleImage(BufferedImage image) {
        return createCompatibleImage(image, image.getWidth(), image.getHeight());
    }

    public static BufferedImage createCompatibleImage(BufferedImage image, int width, int height) {
        return getGraphicsConfiguration().createCompatibleImage(width, height, image.getTransparency());
    }

    public static BufferedImage createCompatibleImage(int width, int height) {
        return getGraphicsConfiguration().createCompatibleImage(width, height);
    }

    public static BufferedImage createCompatibleTranslucentImage(int width, int height) {
        return getGraphicsConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
    }

    public static BufferedImage loadCompatibleImage(URL resource) throws IOException {
        BufferedImage image = ImageIO.read(resource);
        return toCompatibleImage(image);
    }

    public static BufferedImage toCompatibleImage(BufferedImage image) {
        if (image.getColorModel().equals(getGraphicsConfiguration().getColorModel())) {
            return image;
        }
        BufferedImage compatibleImage = getGraphicsConfiguration().createCompatibleImage(image.getWidth(), image.getHeight(), image.getTransparency());
        Graphics g = compatibleImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return compatibleImage;
    }

    public static BufferedImage createThumbnailFast(BufferedImage image, int newSize) {
        float ratio;
        int width = image.getWidth();
        int height = image.getHeight();
        if (width > height) {
            if (newSize >= width) {
                throw new IllegalArgumentException("newSize must be lower than" + " the image width");
            } else if (newSize <= 0) {
                throw new IllegalArgumentException("newSize must" + " be greater than 0");
            }
            ratio = (float) width / (float) height;
            width = newSize;
            height = (int) (newSize / ratio);
        } else {
            if (newSize >= height) {
                throw new IllegalArgumentException("newSize must be lower than" + " the image height");
            } else if (newSize <= 0) {
                throw new IllegalArgumentException("newSize must" + " be greater than 0");
            }
            ratio = (float) height / (float) width;
            height = newSize;
            width = (int) (newSize / ratio);
        }
        BufferedImage temp = createCompatibleImage(image, width, height);
        Graphics2D g2 = temp.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0, 0, temp.getWidth(), temp.getHeight(), null);
        g2.dispose();
        return temp;
    }

    public static BufferedImage createThumbnailFast(BufferedImage image, int newWidth, int newHeight) {
        if (newWidth >= image.getWidth() || newHeight >= image.getHeight()) {
            throw new IllegalArgumentException("newWidth and newHeight cannot" + " be greater than the image" + " dimensions");
        } else if (newWidth <= 0 || newHeight <= 0) {
            throw new IllegalArgumentException("newWidth and newHeight must" + " be greater than 0");
        }
        BufferedImage temp = createCompatibleImage(image, newWidth, newHeight);
        Graphics2D g2 = temp.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0, 0, temp.getWidth(), temp.getHeight(), null);
        g2.dispose();
        return temp;
    }

    public static BufferedImage createThumbnail(BufferedImage image, int newSize) {
        int width = image.getWidth();
        int height = image.getHeight();
        boolean isWidthGreater = width > height;
        if (isWidthGreater) {
            if (newSize >= width) {
                throw new IllegalArgumentException("newSize must be lower than" + " the image width");
            }
        } else if (newSize >= height) {
            throw new IllegalArgumentException("newSize must be lower than" + " the image height");
        }
        if (newSize <= 0) {
            throw new IllegalArgumentException("newSize must" + " be greater than 0");
        }
        float ratioWH = (float) width / (float) height;
        float ratioHW = (float) height / (float) width;
        BufferedImage thumb = image;
        do {
            if (isWidthGreater) {
                width /= 2;
                if (width < newSize) {
                    width = newSize;
                }
                height = (int) (width / ratioWH);
            } else {
                height /= 2;
                if (height < newSize) {
                    height = newSize;
                }
                width = (int) (height / ratioHW);
            }
            BufferedImage temp = createCompatibleImage(image, width, height);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();
            thumb = temp;
        } while (newSize != (isWidthGreater ? width : height));
        return thumb;
    }

    public static BufferedImage createThumbnail(BufferedImage image, int newWidth, int newHeight) {
        int width = image.getWidth();
        int height = image.getHeight();

        if (newWidth >= width || newHeight >= height) {
            throw new IllegalArgumentException("newWidth and newHeight cannot" + " be greater than the image" + " dimensions");
        } else if (newWidth <= 0 || newHeight <= 0) {
            throw new IllegalArgumentException("newWidth and newHeight must" + " be greater than 0");
        }
        BufferedImage thumb = image;
        do {
            if (width > newWidth) {
                width /= 2;
                if (width < newWidth) {
                    width = newWidth;
                }
            }
            if (height > newHeight) {
                height /= 2;
                if (height < newHeight) {
                    height = newHeight;
                }
            }
            BufferedImage temp = createCompatibleImage(image, width, height);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();
            thumb = temp;
        } while (width != newWidth || height != newHeight);
        return thumb;
    }

    public static int[] getPixels(BufferedImage img, int x, int y, int w, int h, int[] pixels) {
        if (w == 0 || h == 0) {
            return new int[0];
        }
        if (pixels == null) {
            pixels = new int[w * h];
        } else if (pixels.length < w * h) {
            throw new IllegalArgumentException("pixels array must have a length" + " >= w*h");
        }
        int imageType = img.getType();
        if (imageType == BufferedImage.TYPE_INT_ARGB || imageType == BufferedImage.TYPE_INT_RGB) {
            Raster raster = img.getRaster();
            return (int[]) raster.getDataElements(x, y, w, h, pixels);
        }
        // Unmanages the image
        return img.getRGB(x, y, w, h, pixels, 0, w);
    }

    public static void setPixels(BufferedImage img, int x, int y, int w, int h, int[] pixels) {
        if (pixels == null || w == 0 || h == 0) {
            return;
        } else if (pixels.length < w * h) {
            throw new IllegalArgumentException("pixels array must have a length" + " >= w*h");
        }

        int imageType = img.getType();
        if (imageType == BufferedImage.TYPE_INT_ARGB || imageType == BufferedImage.TYPE_INT_RGB) {
            WritableRaster raster = img.getRaster();
            raster.setDataElements(x, y, w, h, pixels);
        } else {
            // Unmanages the image
            img.setRGB(x, y, w, h, pixels, 0, w);
        }
    }
}

class CustomButtonRippleEffect {

    private final Component component;
    private Color rippleColor = new Color(255, 255, 255);
    private List<CustomButtonRippleEffect.Effect> effects;

    public CustomButtonRippleEffect(Component component) {
        this.component = component;
        init();
    }

    private void init() {
        effects = new ArrayList<>();
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    addEffect(e.getPoint());
                }
            }
        });
    }

    public void addEffect(Point location) {
        effects.add(new CustomButtonRippleEffect.Effect(component, location));
    }

    public void reder(Graphics g, Shape contain) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (int i = 0; i < effects.size(); i++) {
            CustomButtonRippleEffect.Effect effect = effects.get(i);
            if (effect != null) {
                effect.render(g2, contain);
            }
        }
    }

    private class Effect {

        private final Component component;
        private final Point location;
        private Animator animator;
        private float animate;

        public Effect(Component component, Point location) {
            this.component = component;
            this.location = location;
            init();
        }

        private void init() {
            animator = new Animator(500, new TimingTargetAdapter() {
                @Override
                public void timingEvent(float fraction) {
                    animate = fraction;
                    component.repaint();
                }

                @Override
                public void end() {
                    effects.remove(CustomButtonRippleEffect.Effect.this);
                }
            });
            animator.setResolution(5);
            animator.setDeceleration(.5f);
            animator.start();
        }

        public void render(Graphics2D g2, Shape contain) {
            Area area = new Area(contain);
            area.intersect(new Area(getShape(getSize(contain.getBounds2D()))));
            g2.setColor(rippleColor);
            float alpha = 0.3f;
            if (animate >= 0.7f) {
                double t = animate - 0.7f;
                alpha = (float) (alpha - (alpha * (t / 0.3f)));
            }
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g2.fill(area);
        }

        private Shape getShape(double size) {
            double s = size * animate;
            double x = location.getX();
            double y = location.getY();
            Shape shape = new Ellipse2D.Double(x - s, y - s, s * 2, s * 2);
            return shape;
        }

        private double getSize(Rectangle2D rec) {
            double size;
            if (rec.getWidth() > rec.getHeight()) {
                if (location.getX() < rec.getWidth() / 2) {
                    size = rec.getWidth() - location.getX();
                } else {
                    size = location.getX();
                }
            } else {
                if (location.getY() < rec.getHeight() / 2) {
                    size = rec.getHeight() - location.getY();
                } else {
                    size = location.getY();
                }
            }
            return size + (size * 0.1f);
        }
    }

    public void setRippleColor(Color rippleColor) {
        this.rippleColor = rippleColor;
    }

    public Color getRippleColor() {
        return rippleColor;
    }
}