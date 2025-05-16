package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSelector extends JFrame implements ItemListener {

    private JComboBox<String> imageComboBox;
    private JLabel imageLabel;

    // Image file names
    private String[] imageNames = { "yello_chafa.jpg", "tulsi.webp", "sun.png" };

    public ImageSelector() {
        setTitle("Image Selector");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        imageComboBox = new JComboBox<>(imageNames);
        imageComboBox.addItemListener(this);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        add(imageComboBox, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedImage = (String) imageComboBox.getSelectedItem();

            // Assuming all images are inside a folder named "images"
            String imagePath = "images/" + selectedImage;

            ImageIcon icon = new ImageIcon(imagePath);

            // If image not found, show error
            if (icon.getIconWidth() == -1) {
                JOptionPane.showMessageDialog(this, "Image not found: " + imagePath);
                return;
            }

            // Resize and display image
            Image scaledImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        }
    }

    public static void main(String[] args) {
        new ImageSelector();
    }
}
