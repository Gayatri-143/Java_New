package Exp9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationaryPurchaseSystem extends JFrame implements ActionListener {

    JCheckBox cbNotebook, cbPen, cbPencil;
    JButton orderButton;

    public StationaryPurchaseSystem() {
        setTitle("Stationary Purchase System");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        cbNotebook = new JCheckBox("Notebook @ 50");
        cbPen = new JCheckBox("Pen @ 30");
        cbPencil = new JCheckBox("Pencil @ 10");
        orderButton = new JButton("Order");

        add(cbNotebook);
        add(cbPen);
        add(cbPencil);
        add(orderButton);

        orderButton.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double total = 0;
        StringBuilder message = new StringBuilder();

        if (cbNotebook.isSelected()) {
            int qty = getQuantity("Notebook");
            double price = qty * 50;
            total += price;
            message.append("Notebook Quantity: ").append(qty)
                   .append("  Total:").append(price).append("\n");
        }

        if (cbPen.isSelected()) {
            int qty = getQuantity("Pen");
            double price = qty * 30;
            total += price;
            message.append("Pen Quantity: ").append(qty)
                   .append("  Total:").append(price).append("\n");
        }

        if (cbPencil.isSelected()) {
            int qty = getQuantity("Pencil");
            double price = qty * 10;
            total += price;
            message.append("Pencil Quantity: ").append(qty)
                   .append("  Total:").append(price).append("\n");
        }

        message.append("-------------------------\n");
        message.append("Total: ").append(total);

        if (total == 0) {
            JOptionPane.showMessageDialog(this, "No items selected.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, message.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Successfully Ordered.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }

    private int getQuantity(String item) {
        int qty = 0;
        boolean valid = false;

        while (!valid) {
            String input = JOptionPane.showInputDialog(this, "Enter Quantity for " + item);
            try {
                if (input == null) break; // Cancel pressed
                qty = Integer.parseInt(input);
                if (qty < 0) throw new NumberFormatException();
                valid = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a non-negative number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return qty;
    }

    public static void main(String[] args) {
        new StationaryPurchaseSystem();
    }
}
