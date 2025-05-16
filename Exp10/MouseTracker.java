package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTracker extends JFrame implements MouseMotionListener {

    private JLabel coordinatesLabel;

    public MouseTracker() {
        setTitle("Mouse Tracker");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        coordinatesLabel = new JLabel("Move your mouse inside the window.");
        add(coordinatesLabel);

        addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        coordinatesLabel.setText("Mouse Coordinates: X = " + e.getX() + ", Y = " + e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Not used, but required by MouseMotionListener
    }

    public static void main(String[] args) {
        new MouseTracker();
    }
}
