import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class meals {

    public static void meals() {

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
        JLabel titleLabel = new JLabel("Meals", JLabel.CENTER);
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

        JButton ButtonMeals4 = new JButton("Chicken Burger");
        ButtonMeals4.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals4.setBackground(new Color(100, 149, 237));
        ButtonMeals4.setForeground(Color.WHITE);
        ButtonMeals4.setPreferredSize(new Dimension(120, 40));
        ButtonMeals4.setFocusPainted(false);
        ButtonMeals4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(ButtonMeals4, gbc);

        JButton ButtonMeals5 = new JButton("Beef Burger");
        ButtonMeals5.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals5.setBackground(new Color(100, 149, 237));
        ButtonMeals5.setForeground(Color.WHITE);
        ButtonMeals5.setPreferredSize(new Dimension(120, 40));
        ButtonMeals5.setFocusPainted(false);
        ButtonMeals5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(ButtonMeals5, gbc);

        JButton ButtonMeals6 = new JButton("Omelet sandwich");
        ButtonMeals6.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals6.setBackground(new Color(100, 149, 237));
        ButtonMeals6.setForeground(Color.WHITE);
        ButtonMeals6.setPreferredSize(new Dimension(120, 40));
        ButtonMeals6.setFocusPainted(false);
        ButtonMeals6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(ButtonMeals6, gbc);

        JButton ButtonMeals1 = new JButton("Fries");
        ButtonMeals1.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals1.setBackground(new Color(100, 149, 237));
        ButtonMeals1.setForeground(Color.WHITE);
        ButtonMeals1.setPreferredSize(new Dimension(120, 40));
        ButtonMeals1.setFocusPainted(false);
        ButtonMeals1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 5;
        gbc.gridy = 5;
        panel.add(ButtonMeals1, gbc);

        JButton ButtonMeals2 = new JButton("Turkey sandwich ");
        ButtonMeals2.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals2.setBackground(new Color(100, 149, 237));
        ButtonMeals2.setForeground(Color.WHITE);
        ButtonMeals2.setPreferredSize(new Dimension(120, 40));
        ButtonMeals2.setFocusPainted(false);
        ButtonMeals2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 5;
        gbc.gridy = 6;
        panel.add(ButtonMeals2, gbc);

        JButton ButtonMeals3 = new JButton("Chease sandwich");
        ButtonMeals3.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonMeals3.setBackground(new Color(100, 149, 237));
        ButtonMeals3.setForeground(Color.WHITE);
        ButtonMeals3.setPreferredSize(new Dimension(120, 40));
        ButtonMeals3.setFocusPainted(false);
        ButtonMeals3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 5;
        gbc.gridy = 7;
        panel.add(ButtonMeals3, gbc);

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
        ButtonMeals1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(1);

            }
        });
        ButtonMeals2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(2);

            }
        });
        ButtonMeals3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(3);

            }
        });

        ButtonMeals4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(4);

            }
        });

        ButtonMeals5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(5);

            }
        });

        ButtonMeals6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(6);

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