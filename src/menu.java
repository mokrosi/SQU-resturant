import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class menu {
    public static void menu() {

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        // Create the main frame
        JFrame frame = new JFrame("SQU Restuante Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setBackground(new Color(15, 60, 69));
        panel.setLayout(new GridBagLayout());

        // Create and add a label
        JLabel titleLabel = new JLabel("SQU Restuante Menu", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(255, 255, 200));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);

        // Add some vertical space
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Create and add a text field for name inpu

        // Add some vertical space
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Create and add a button to show the menu

        JButton ButtonMeals = new JButton("Meals");
        ButtonMeals.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals.setBackground(new Color(100, 149, 237));
        ButtonMeals.setForeground(Color.WHITE);
        ButtonMeals.setPreferredSize(new Dimension(120, 40));
        ButtonMeals.setFocusPainted(false);
        ButtonMeals.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(ButtonMeals, gbc);

        JButton ButtonDrinks = new JButton("Drinks");
        ButtonDrinks.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrinks.setBackground(new Color(100, 149, 237));
        ButtonDrinks.setForeground(Color.WHITE);
        ButtonDrinks.setPreferredSize(new Dimension(120, 40));
        ButtonDrinks.setFocusPainted(false);
        ButtonDrinks.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(ButtonDrinks, gbc);

        JButton ButtonSweets = new JButton("Sweets");
        ButtonSweets.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonSweets.setBackground(new Color(100, 149, 237));
        ButtonSweets.setForeground(Color.WHITE);
        ButtonSweets.setPreferredSize(new Dimension(120, 40));
        ButtonSweets.setFocusPainted(false);
        ButtonSweets.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(ButtonSweets, gbc);

        JButton ButtonDone = new JButton("Done");
        ButtonDone.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDone.setBackground(new Color(100, 50, 50));
        ButtonDone.setForeground(Color.WHITE);
        ButtonDone.setPreferredSize(new Dimension(120, 40));
        ButtonDone.setFocusPainted(false);
        ButtonDone.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(ButtonDone, gbc);

        frame.setVisible(true);
        frame.add(panel);

        // Add an action listener to the button
        ButtonMeals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meals.meals();
                frame.setVisible(false);

            }
        });
        ButtonDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinks.drinks();
                frame.setVisible(false);

            }
        });
        ButtonSweets.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sweets.sweets();
                frame.setVisible(false);

            }
        });

        ButtonDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                order.order();

                try {
                    prosses.printOrder();

                } catch (IOException ez) {

                }

            }
        });

    }
}