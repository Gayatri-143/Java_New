package Exp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutSwapExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Swap Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        // Create an array to hold buttons for access
        JButton[] buttons = new JButton[6];

        // Create and add buttons to the frame
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            frame.add(buttons[i]);
        }

        // Add action listeners to each button
        for (int i = 0; i < 6; i++) {
            final int index = i;
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Find the button labeled "1"
                    int indexOfOne = -1;
                    for (int j = 0; j < 6; j++) {
                        if (buttons[j].getText().equals("1")) {
                            indexOfOne = j;
                            break;
                        }
                    }

                    // Swap only if the clicked button is not already "1"
                    if (indexOfOne != -1 && index != indexOfOne) {
                        String temp = buttons[index].getText();
                        buttons[index].setText("1");
                        buttons[indexOfOne].setText(temp);
                    }
                }
            });
        }

        frame.setVisible(true);
    }
}

