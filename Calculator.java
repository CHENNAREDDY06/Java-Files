package com.javaArrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private boolean foundKey;
    private static boolean clearText;
    private int prevOperator;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.setPreferredSize(new Dimension(300, 300)); // Set panel size to be smaller than the frame
        panel.setBackground(Color.RED);
        
        panel.add(new JButton("VRR"));
        panel.add(new JButton("SHANNU"));
        panel.add(new JButton("VRR"));
        panel.add(new JButton("SHANNU"));
        panel.add(new JButton("VRR"));
        panel.add(new JButton("VRR"));

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This method will be called when a button is clicked.
        // You can add your logic here to handle button clicks.
    }
}
