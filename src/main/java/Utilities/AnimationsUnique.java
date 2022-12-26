package Utilities;

import javax.swing.*;

/**
 * Class containing all the shortened methods to animate specific components
 *
 * @version 18.0.1
 * @since 2022-06-12
 */

public class AnimationsUnique {

    /**
     * Variable to store the animation movement amount of the button animations
     */
    private int button_Movement_Amount = 4;
    /**
     * Variable to store the animation movement delay of the button animations
     */
    private int button_Movement_Delay = 8;

    /**
     * Getter method to get the animation movement amount of the button animations
     * @return int with the animation movement amount of the button animations
     */
    public int getButton_Movement_Amount() {
        return button_Movement_Amount;
    }

    /**
     * Setter method to set the animation movement amount of the button animations
     * @param button_Movement_Amount int with the animation movement amount of the button animations
     */
    public void setButton_Movement_Amount(int button_Movement_Amount) {
        this.button_Movement_Amount = button_Movement_Amount;
    }

    /**
     * Getter method to get the animation movement delay of the button animations
     * @return int with the animation movement delay of the button animations
     */
    public int getButton_Movement_Delay() {
        return button_Movement_Delay;
    }

    /**
     * Setter method to set the animation movement delay of the button animations
     * @param button_Movement_Delay int with the animation movement delay of the button animations
     */
    public void setButton_Movement_Delay(int button_Movement_Delay) {
        this.button_Movement_Delay = button_Movement_Delay;
    }

    /**
     * Function to animate a button made of JPanels to the Y Up
     *
     * @param button JPanel to animate
     * @param Y Int with the Y position of the button
     */
    public void animButtonUp(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYUp(Y, Y - button_Movement_Amount, button_Movement_Delay, 1, button);
    }

    /**
     * Function to animate a button made of JPanels to the Y Down
     *
     * @param button JPanel to animate
     * @param Y Int with the Y position of the button
     */
    public void animButtonDown(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYDown(Y - button_Movement_Amount, Y, button_Movement_Delay, 1, button);
    }

    /**
     * Function to quick animate a button made of JPanels to the Y Up
     *
     * @param button JPanel to animate
     * @param Y Int with the Y position of the button
     */
    public void quickAnimButtonUp(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYUp(Y, Y - button_Movement_Amount, button_Movement_Delay / 2, 1, button);
    }

    /**
     * Function to quick animate a button made of JPanels to the Y Down
     *
     * @param button JPanel to animate
     * @param Y Int with the Y position of the button
     */
    public void quickAnimButtonDown(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYDown(Y - button_Movement_Amount, Y, button_Movement_Delay / 2, 1, button);
    }

    /**
     * Variable to store the animation movement amount of the label animations
     */
    private int label_Movement_Amount = 4;
    /**
     * Variable to store the animation movement delay of the label animations
     */
    private int label_Movement_Delay = 8;

    /**
     * Getter method to get the animation movement amount of the label animations
     * @return int with the animation movement amount of the label animations
     */
    public int getLabel_Movement_Amount() {
        return label_Movement_Amount;
    }

    /**
     * Setter method to set the animation movement amount of the label animations
     * @param label_Movement_Amount int with the animation movement amount of the label animations
     */
    public void setLabel_Movement_Amount(int label_Movement_Amount) {
        this.label_Movement_Amount = label_Movement_Amount;
    }

    /**
     * Getter method to get the animation movement delay of the label animations
     * @return int with the animation movement delay of the label animations
     */
    public int getLabel_Movement_Delay() {
        return label_Movement_Delay;
    }

    /**
     * Setter method to set the animation movement delay of the label animations
     * @param label_Movement_Delay int with the animation movement delay of the label animations
     */
    public void setLabel_Movement_Delay(int label_Movement_Delay) {
        this.label_Movement_Delay = label_Movement_Delay;
    }

    /**
     * Function to animate a label to the Y Up
     *
     * @param label JPanel to animate
     * @param Y Int with the Y position of the label
     */
    public void animLabelUp(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYUp(Y, Y - label_Movement_Amount, label_Movement_Delay, 1, label);
    }

    /**
     * Function to animate a label to the Y Down
     *
     * @param label JPanel to animate
     * @param Y Int with the Y position of the label
     */
    public void animLabelDown(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYDown(Y - label_Movement_Amount, Y, label_Movement_Delay, 1, label);
    }

    /**
     * Function to quick animate a label to the Y Up
     *
     * @param label JPanel to animate
     * @param Y Int with the Y position of the label
     */
    public void quickAnimLabelUp(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYUp(Y, Y - label_Movement_Amount, label_Movement_Delay / 2, 1, label);
    }

    /**
     * Function to quick animate a label to the Y Down
     *
     * @param label JPanel to animate
     * @param Y Int with the Y position of the label
     */
    public void quickAnimLabelDown(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYDown(Y - label_Movement_Amount, Y, label_Movement_Delay / 2, 1, label);
    }

}
