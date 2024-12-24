import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class order {

    public static void order() {

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
        JLabel titleLabel = new JLabel("Your order", JLabel.CENTER);
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

        JButton Buttonsee = new JButton("Your order");
        Buttonsee.setFont(new Font("Arial", Font.BOLD, 14));
        Buttonsee.setBackground(new Color(100, 149, 237));
        Buttonsee.setForeground(Color.WHITE);
        Buttonsee.setPreferredSize(new Dimension(120, 40));
        Buttonsee.setFocusPainted(false);
        Buttonsee.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(Buttonsee, gbc);

        JButton ButtonBack = new JButton("Back");
        ButtonBack.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonBack.setBackground(new Color(100, 149, 237));
        ButtonBack.setForeground(Color.WHITE);
        ButtonBack.setPreferredSize(new Dimension(120, 40));
        ButtonBack.setFocusPainted(false);
        ButtonBack.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(ButtonBack, gbc);

        JButton ButtonBill = new JButton("bill");
        ButtonBill.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonBill.setBackground(new Color(100, 50, 50));
        ButtonBill.setForeground(Color.WHITE);
        ButtonBill.setPreferredSize(new Dimension(120, 40));
        ButtonBill.setFocusPainted(false);
        ButtonBill.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(ButtonBill, gbc);

        frame.setVisible(true);
        frame.add(panel);

        JButton ButtonNew = new JButton("Next Customer ");
        ButtonNew.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonNew.setBackground(new Color(80, 50, 50));
        ButtonNew.setForeground(Color.WHITE);
        ButtonNew.setPreferredSize(new Dimension(120, 40));
        ButtonNew.setFocusPainted(false);
        ButtonNew.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(ButtonNew, gbc);

        frame.setVisible(true);
        frame.add(panel);

        // Add an action listener to the button

        Buttonsee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    prosses.printOrder();

                } catch (Exception ez) {
                    // TODO: handle exception
                }

            }
        });

        ButtonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                menu.menu();

            }
        });

        ButtonBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    prosses.printBill();

                } catch (Exception ez) {
                    // TODO: handle exception
                }
            }
        });

        ButtonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                prosses.writeFile();

                prosses.restartSystem();

            }
        });

    }
}