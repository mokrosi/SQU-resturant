import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class namePage {
    public static void main(String[] args) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        // Create the main frame
        JFrame frame = new JFrame("SQU Restuante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setBackground(new Color(15, 60, 69));
        panel.setLayout(new GridBagLayout());

        // Create and add a label
        JLabel titleLabel = new JLabel("SQU Restuante", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(255, 255, 200));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);

        JLabel NameLabel = new JLabel("Entar your name :");
        NameLabel.setForeground(Color.WHITE);
        NameLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
        JTextField nameField = new JTextField(20);
        nameField.setPreferredSize(new Dimension(150, 30));
        nameField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(NameLabel, gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        // Add some vertical space
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Create and add a text field for name inpu

        // Add some vertical space
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Create and add a button to show the menu
        JButton Button = new JButton("Show Menu...");
        Button.setFont(new Font("Arial", Font.BOLD, 14));
        Button.setBackground(new Color(100, 149, 237));
        Button.setForeground(Color.WHITE);
        Button.setPreferredSize(new Dimension(120, 40));
        Button.setFocusPainted(false);
        Button.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(Button, gbc);

        frame.setVisible(true);
        frame.add(panel);

        // Add an action listener to the button
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String name = nameField.getText();

                String name = nameField.getText();
                if (name == null || name.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Error: Entar your name ");
                    frame.setVisible(false);
                    main(null);

                } else {
                    frame.setVisible(false);
                    prosses.setName(name);

                    menu.menu();
                }

                // You can add more functionality here to display the actual menu
            }
        });

        // Add the panel to the frame

        // Set the frame visibility to true
        // frame.setVisible(true);
    }
}