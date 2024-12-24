import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sweets {

    public static void sweets() {

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
        JLabel titleLabel = new JLabel("sweets", JLabel.CENTER);
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

        JButton ButtonSweets1 = new JButton("Croissant");
        ButtonSweets1.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonSweets1.setBackground(new Color(100, 149, 237));
        ButtonSweets1.setForeground(Color.WHITE);
        ButtonSweets1.setPreferredSize(new Dimension(120, 40));
        ButtonSweets1.setFocusPainted(false);
        ButtonSweets1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(ButtonSweets1, gbc);

        JButton ButtonSweets2 = new JButton("chocolate cake ");
        ButtonSweets2.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonSweets2.setBackground(new Color(100, 149, 237));
        ButtonSweets2.setForeground(Color.WHITE);
        ButtonSweets2.setPreferredSize(new Dimension(120, 40));
        ButtonSweets2.setFocusPainted(false);
        ButtonSweets2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(ButtonSweets2, gbc);

        JButton ButtonSweets3 = new JButton("Muffen");
        ButtonSweets3.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonSweets3.setBackground(new Color(100, 149, 237));
        ButtonSweets3.setForeground(Color.WHITE);
        ButtonSweets3.setPreferredSize(new Dimension(120, 40));
        ButtonSweets3.setFocusPainted(false);
        ButtonSweets3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(ButtonSweets3, gbc);

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
        ButtonSweets1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(13);

            }
        });
        ButtonSweets2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(14);

            }
        });
        ButtonSweets3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosses.prosses(15);

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