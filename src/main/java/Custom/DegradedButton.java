package Custom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DegradedButton extends JButton {

    enum State {
        NORMAL, HOVER, PRESSED
    }

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private State state;
    private final RenderingHints hints;
    private Color actualColor;
    private int changeCoefficient = 3;
    private int radius;

    Timer timer = new Timer(1, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            changeActualColor();
            repaint();
        }
    });

    private void changeActualColor() {
        if (state == State.NORMAL) {
            actualColor = changeColorOnce(actualColor, color);
        } else if (state == State.HOVER) {
            actualColor = changeColorOnce(actualColor, colorOver);
        } else if (state == State.PRESSED) {
            actualColor = changeColorOnce(actualColor, colorClick);
        }
    }

    public Color changeColorOnce(Color from, Color to) {
        int ci1 = from.getRed(), ci2 = from.getGreen(), ci3 = from.getBlue();
        int cf1 = to.getRed(), cf2 = to.getGreen(), cf3 = to.getBlue();

        // Red Color
        ci1 = getCi1(ci1, cf1);

        // Green Color
        ci2 = getCi1(ci2, cf2);

        // Blue Color
        ci3 = getCi1(ci3, cf3);

        return new Color(ci1, ci2, ci3);
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

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        actualColor = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getChangeCoefficient() {
        return changeCoefficient;
    }

    public void setChangeCoefficient(int changeCoefficient) {
        this.changeCoefficient = changeCoefficient;
    }

    public DegradedButton() {
        // State
        state = State.NORMAL;
        timer.start();
        actualColor = color;

        // Hints
        hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        setContentAreaFilled(false);

        //  Init Color
        setColor(Color.WHITE);
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);

        //  Add event mouse
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

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHints(hints);

        //  Paint Border
        g2.setColor(actualColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(grphcs);
    }

}
