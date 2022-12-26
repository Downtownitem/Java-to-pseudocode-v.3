package Custom.ShadowPanelComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class PanelShadow extends JPanel {

    public ShadowPanelForm getForm() {
        return form;
    }

    public void setForm(ShadowPanelForm form) {
        this.form = form;
    }

    public ShadowType getShadowType() {
        return shadowType;
    }

    public void setShadowType(ShadowType shadowType) {
        this.shadowType = shadowType;
    }

    public int getShadowSize() {
        return shadowSize;
    }

    public void setShadowSize(int shadowSize) {
        this.shadowSize = shadowSize;
    }

    public float getShadowOpacity() {
        return shadowOpacity;
    }

    public void setShadowOpacity(float shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    public void setPanelWidth(int size) {
        this.panelWidth = size;
    }

    public int getPanelWidth() {
        return this.panelWidth;
    }

    public void setPanelHeight(int size) {
        this.panelHeight = size;
    }

    public int getPanelHeight() {
        return this.panelHeight;
    }

    private ShadowType shadowType = ShadowType.CENTER;
    private ShadowPanelForm form = ShadowPanelForm.CIRCLE;
    private int shadowSize = 6;
    private int radius = 10;
    private float shadowOpacity = 0.5f;
    private Color shadowColor = Color.BLACK;
    private int panelWidth = 100;
    private int panelHeight = 100;

    public PanelShadow() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        createShadow(grphcs);
        super.paintComponent(grphcs);
    }

    private void createShadow(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        int size = shadowSize * 2;
        int x = 0;
        int y = 0;
        int width = getWidth() - size;
        int height = getHeight() - size;
        if (shadowType == ShadowType.TOP) {
            x = shadowSize;
            y = size;
        } else if (shadowType == ShadowType.BOT) {
            x = shadowSize;
            y = 0;
        } else if (shadowType == ShadowType.TOP_LEFT) {
            x = size;
            y = size;
        } else if (shadowType == ShadowType.TOP_RIGHT) {
            x = 0;
            y = size;
        } else if (shadowType == ShadowType.BOT_LEFT) {
            x = size;
            y = 0;
        } else if (shadowType == ShadowType.BOT_RIGHT) {
            x = 0;
            y = 0;
        } else {
            //  Center
            x = shadowSize;
            y = shadowSize;
        }
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setColor(getBackground());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (form == ShadowPanelForm.CIRCLE) {
            g.fillOval(0, 0, width, width);
        } else {
            g.fillRoundRect(0, 0, width, height, radius, radius);
        }

        //  Create Shadow
        ShadowRenderer render = new ShadowRenderer(shadowSize, shadowOpacity, shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(img, x, y, null);
    }
}
