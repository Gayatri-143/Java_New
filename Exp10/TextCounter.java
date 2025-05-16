package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCounter extends JFrame implements KeyListener {

    private JTextArea textArea;
    private JLabel infoLabel;

    public TextCounter() {
        setTitle("Character & Word Counter");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.addKeyListener(this);

        infoLabel = new JLabel("Characters: 0 | Words: 0");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        infoLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(infoLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Update character and word count
    private void updateCount() {
        String text = textArea.getText();
        int charCount = text.length();

        // Split by whitespace, filter out empty tokens
        String[] words = text.trim().split("\\s+");
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

        infoLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        SwingUtilities.invokeLater(this::updateCount);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Not needed
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not needed
    }

    public static void main(String[] args) {
        new TextCounter();
    }
}

