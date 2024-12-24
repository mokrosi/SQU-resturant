import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

import javax.swing.*;

public class prosses {

    public static ArrayList<Integer> order = new ArrayList<>();
    public static ArrayList<String> orderName = new ArrayList<>();

    public static StringBuilder bill = new StringBuilder();

    public static String name;

    public static void prosses(int orderNew) {

        prosses.order.add(orderNew);

    }

    public static void setName(String nameGET) {
        name = nameGET;
    }

    public static void printOrder() throws IOException {

        Scanner scanner = new Scanner(new FileReader("mune.txt"));
        ArrayList<String> orderN = new ArrayList<>();

        ArrayList<String> menuItems = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            menuItems.add(line);
        }
        scanner.close();

        for (int orderNum : order) {
            for (String menuItem : menuItems) {
                String[] parts = menuItem.split(" ", 2);
                int menuNum = Integer.parseInt(parts[0]);
                String menuName = parts[1];

                if (menuNum == orderNum) {
                    orderN.add(menuName);
                    break;
                }
            }
        }

        if (orderN.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No matching orders found!");
        } else {
            JOptionPane.showMessageDialog(null, "Orders:\n" + String.join("\n", orderN));
        }
    }

    public static void printBill() throws IOException {

        Scanner scanner = new Scanner(new FileReader("mune.txt"));
        ArrayList<String> menuItems = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            menuItems.add(line);
        }
        scanner.close();

        ArrayList<String> orderNames = new ArrayList<>();
        double total = 0.0;

        for (int orderNum : order) {
            for (String menuItem : menuItems) {
                String[] parts = menuItem.split(" ", 3);
                int menuNum = Integer.parseInt(parts[0]);
                String menuName = parts[1];
                double price = Double.parseDouble(parts[2]);

                if (menuNum == orderNum) {
                    orderNames.add(menuName + " - " + price + " OR");
                    total += price;
                    break;
                }
            }
        }

        bill.append("*******************************\n");
        bill.append("      Welcome to Our Shop         \n");
        bill.append("Customer Name :" + name + "\n");
        bill.append("*******************************\n");

        bill.append("Your Orders:\n");

        for (String order : orderNames) {
            bill.append("- ").append(order).append("\n");
        }

        bill.append("\n-------------------------------\n");
        bill.append(String.format("Total: %.3f OR\n", total));
        bill.append("*******************************\n");
        bill.append("   Thank you for your visit!   \n");
        bill.append("*******************************");
        bill.append("\n");
        bill.append("\n");

        // writeFile(bill.toString());

        if (orderNames.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No matching orders found!");
        } else {
            JOptionPane.showMessageDialog(null, bill.toString(), "Invoice", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void writeFile() {

        if (bill.toString() == null || bill.toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid input. Nothing to write.");
            return;
        }

        try (FileWriter writer = new FileWriter("orders.txt", true)) {

            writer.write(bill.toString());
        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void restartSystem() {

        order.clear();

        namePage.main(null);
        JOptionPane.showMessageDialog(null, "Next Customer ❤️❤️❤️");

    }
}
