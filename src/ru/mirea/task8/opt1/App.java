package ru.mirea.task8.opt1;
import javax.swing.*;
import java.awt.*;


public class App {
    public static void  main(String[] args) {
        JFrame frame = new JFrame("20 random shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Window window = new Window();
        window.setBackground(Color.white);
        frame.add(window);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}
