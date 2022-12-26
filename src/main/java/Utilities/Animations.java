package Utilities;

import javax.swing.*;

/**
 * Class containing all the methods to animate the components in a JFrame
 *
 * @version 18.0.1
 * @since 2022-06-12
 */

public class Animations {

    /**
     * Necessary of use the constructor
     */
    public Animations() {
    }

    /**
     * Function to animate a jLabel to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jLabel JLabel to animate
     */
    public void jLabelYUp(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(jLabel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jLabel.setLocation(jLabel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jLabel to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jLabel JLabel to animate
     */
    public void jLabelYDown(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(jLabel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jLabel.setLocation(jLabel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jLabel to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jLabel JLabel to animate
     */
    public void jLabelXLeft(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(i, jLabel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jLabel.setLocation(stop, jLabel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jLabel to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jLabel JLabel to animate
     */
    public void jLabelXRight(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(i, jLabel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jLabel.setLocation(stop, jLabel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextField to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jTextField JTextField to animate
     */
    public void jTextFieldYUp(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(jTextField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jTextField.setLocation(jTextField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextField to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jTextField JTextField to animate
     */
    public void jTextFieldYDown(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(jTextField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jTextField.setLocation(jTextField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextField to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jTextField JTextField to animate
     */
    public void jTextFieldXLeft(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(i, jTextField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jTextField.setLocation(stop, jTextField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextField to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jTextField JTextField to animate
     */
    public void jTextFieldXRight(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(i, jTextField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jTextField.setLocation(stop, jTextField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jButton to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jButton JButton to animate
     */
    public void jButtonYUp(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(jButton.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jButton.setLocation(jButton.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jButton to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jButton JButton to animate
     */
    public void jButtonYDown(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(jButton.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jButton.setLocation(jButton.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jButton to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jButton JButton to animate
     */
    public void jButtonXLeft(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(i, jButton.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jButton.setLocation(stop, jButton.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jButton to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jButton JButton to animate
     */
    public void jButtonXRight(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(i, jButton.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jButton.setLocation(stop, jButton.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jPasswordField to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPasswordField JPasswordField to animate
     */
    public void jPasswordFieldYUp(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(jPasswordField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPasswordField.setLocation(jPasswordField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jPasswordField to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPasswordField JPasswordField to animate
     */
    public void jPasswordFieldYDown(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(jPasswordField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPasswordField.setLocation(jPasswordField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jPasswordField to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPasswordField JPasswordField to animate
     */
    public void jPasswordFieldXLeft(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(i, jPasswordField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPasswordField.setLocation(stop, jPasswordField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jPasswordField to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPasswordField JPasswordField to animate
     */
    public void jPasswordFieldXRight(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(i, jPasswordField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPasswordField.setLocation(stop, jPasswordField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextArea to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jScrollPane JTextArea to animate
     */
    public void jTextAreaYUp(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(jScrollPane.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jScrollPane.setLocation(jScrollPane.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextArea to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jScrollPane JTextArea to animate
     */
    public void jTextAreaYDown(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(jScrollPane.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jScrollPane.setLocation(jScrollPane.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextArea to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jScrollPane JTextArea to animate
     */
    public void jTextAreaXLeft(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(i, jScrollPane.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jScrollPane.setLocation(stop, jScrollPane.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a jTextArea to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jScrollPane JTextArea to animate
     */
    public void jTextAreaXRight(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(i, jScrollPane.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jScrollPane.setLocation(stop, jScrollPane.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JPanel to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPanel JPanel to animate
     */
    public void jPanelXLeft(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(i, jPanel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPanel.setLocation(stop, jPanel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JPanel to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPanel JPanel to animate
     */
    public void jPanelXRight(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(i, jPanel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPanel.setLocation(stop, jPanel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JPanel to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPanel JPanel to animate
     */
    public void jPanelYUp(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(jPanel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPanel.setLocation(jPanel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JPanel to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param jPanel JPanel to animate
     */
    public void jPanelYDown(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(jPanel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPanel.setLocation(jPanel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JList to the X left
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param list JList to animate
     */
    public void jListXLeft(final int start, final int stop, final int delay, final int increment, final JScrollPane list) {
        if (list.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (list.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    list.setLocation(i, list.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        list.setLocation(stop, list.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JList to the X right
     *
     * @param start Int with the start X position
     * @param stop Int with the end X position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param list JList to animate
     */
    public void jListXRight(final int start, final int stop, final int delay, final int increment, final JScrollPane list) {
        if (list.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (list.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    list.setLocation(i, list.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        list.setLocation(stop, list.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JList to the Y up
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param list JList to animate
     */
    public void jListYUp(final int start, final int stop, final int delay, final int increment, final JScrollPane list) {
        if (list.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (list.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    list.setLocation(list.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        list.setLocation(list.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    /**
     * Function to animate a JList to the Y down
     *
     * @param start Int with the start Y position
     * @param stop Int with the end Y position
     * @param delay Int with the delay between each movement in milliseconds
     * @param increment Int with the amount of pixels to move each time
     * @param list JList to animate
     */
    public void jListYDown(final int start, final int stop, final int delay, final int increment, final JScrollPane list) {
        if (list.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (list.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    list.setLocation(list.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        list.setLocation(list.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

}
