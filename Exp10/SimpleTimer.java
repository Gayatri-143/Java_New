package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {

    private JLabel timerLabel;
    private JButton startButton, stopButton;
    private Timer timer;
    private int seconds = 0;

    public SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        timerLabel = new JLabel("Time: 0 seconds");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 20));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        add(timerLabel);
        add(startButton);
        add(stopButton);

        startButton.addActionListener(this);
        stopButton.addActionListener(this);

        // Timer fires every 1000 ms (1 second)
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timerLabel.setText("Time: " + seconds + " seconds");
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == startButton) {
            timer.start();
        } else if (src == stopButton) {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}
