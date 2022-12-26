package Custom;

import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LogoLabel extends JLabel {

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
        repaint();
    }

    public boolean isEnableHeigth() {
        return enableHeigth;
    }

    public void setEnableHeigth(boolean enableHeigth) {
        this.enableHeigth = enableHeigth;
        repaint();
    }

    private Icon image;
    private boolean enableHeigth = true;

    public LogoLabel() {

    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        setText("");
        if (image != null) {
            if (enableHeigth) {
                double newHeigth = ((double) image.getIconHeight() * (double) getWidth()) / (double) image.getIconWidth();
                grphcs.drawImage(((ImageIcon) image).getImage(), 0, 0, getWidth(), (int) newHeigth, null);
            } else {
                double newWidth = ((double) image.getIconWidth() * (double) getHeight()) / (double) image.getIconHeight();
                grphcs.drawImage(((ImageIcon) image).getImage(), 0, 0, (int) newWidth, getHeight(), null);
            }
        }
        super.paintComponent(grphcs);
    }

}
