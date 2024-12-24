import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class drinks {

    public static void drinks() {

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        // Create the main frame
        JFrame frame = new JFrame("SQU Restuante Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setBackground(new Color(15, 60, 69));
        panel.setLayout(new GridBagLayout());

        // Create and add a label
        JLabel titleLabel = new JLabel("Drinks", JLabel.CENTER);
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

        JButton ButtonDrink1 = new JButton("Orange juice");
        ButtonDrink1.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrink1.setBackground(new Color(100, 149, 237));
        ButtonDrink1.setForeground(Color.WHITE);
        ButtonDrink1.setPreferredSize(new Dimension(120, 40));
        ButtonDrink1.setFocusPainted(false);
        ButtonDrink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(ButtonDrink1, gbc);

        JButton ButtonDrink2 = new JButton("Mango juice");
        ButtonDrink2.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrink2.setBackground(new Color(100, 149, 237));
        ButtonDrink2.setForeground(Color.WHITE);
        ButtonDrink2.setPreferredSize(new Dimension(120, 40));
        ButtonDrink2.setFocusPainted(false);
        ButtonDrink2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(ButtonDrink2, gbc);

        JButton ButtonDrink3 = new JButton("kinza");
        ButtonDrink3.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrink3.setBackground(new Color(100, 149, 237));
        ButtonDrink3.setForeground(Color.WHITE);
        ButtonDrink3.setPreferredSize(new Dimension(120, 40));
        ButtonDrink3.setFocusPainted(false);
        ButtonDrink3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(ButtonDrink3, gbc);

        JButton ButtonDrink4 = new JButton("Coffee");
        ButtonDrink4.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrink4.setBackground(new Color(100, 149, 237));
        ButtonDrink4.setForeground(Color.WHITE);
        ButtonDrink4.setPreferredSize(new Dimension(120, 40));
        ButtonDrink4.setFocusPainted(false);
        ButtonDrink4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 5;
        gbc.gridy = 5;
        panel.add(ButtonDrink4, gbc);

        JButton ButtonDrink5 = new JButton("Water ");
        ButtonDrink5.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrink5.setBackground(new Color(100, 149, 237));
        ButtonDrink5.setForeground(Color.WHITE);
        ButtonDrink5.setPreferredSize(new Dimension(120, 40));
        ButtonDrink5.setFocusPainted(false);
        ButtonDrink5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 5;
        gbc.gridy = 6;
        panel.add(ButtonDrink5, gbc);

        JButton ButtonDrink6 = new JButton("Tea");
        ButtonDrink6.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDrink6.setBackground(new Color(100, 149, 237));
        ButtonDrink6.setForeground(Color.WHITE);
        ButtonDrink6.setPreferredSize(new Dimension(120, 40));
        ButtonDrink6.setFocusPainted(false);
        ButtonDrink6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 5;
        gbc.gridy = 7;
        panel.add(ButtonDrink6, gbc);

        JButton ButtonDone = new JButton("Done");
        ButtonDone.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonDone.setBackground(new Color(100, 50, 50));
        ButtonDone.setForeground(Color.WHITE);
        ButtonDone.setPreferredSize(new Dimension(120, 40));
        ButtonDone.setFocusPainted(false);
        ButtonDone.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 2;
        gbc.gridy = 8;
        panel.add(ButtonDone, gbc);

        frame.setVisible(true);
        frame.add(panel);

        // Add an action listener to the button
        ButtonDrink1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(7);

            }
        });
        ButtonDrink2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(8);

            }
        });
        ButtonDrink3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(9);

            }
        });

        ButtonDrink4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(10);

            }
        });

        ButtonDrink5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(11);

            }
        });

        ButtonDrink6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(12);

            }
        });

        ButtonDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);

                menu.menu();

            }
        });

    }
}