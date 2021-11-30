package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel {
    static String currentDir = System.getProperty("user.dir");
    static String path = currentDir + "/src/ru/mirea/task8/opt2/img.png";
    static Image img = new ImageIcon(path).getImage();

    public void paintComponent (Graphics graphics){
        graphics.drawImage(img, 0, 0, null);
    }

    public static void  main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(412, 402);
        frame.add(new Picture());
        frame.setVisible(true);
    }
}
