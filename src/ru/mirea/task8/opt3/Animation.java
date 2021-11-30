package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Animation extends JPanel {
    static ArrayList<ImageIcon> Gif = new ArrayList<>();
    static JLabel Screen = new JLabel();

    public void gif() throws InterruptedException {
        while (true){
            for (int i=1; i<=47; i++){
                Screen.setIcon(Gif.get(i - 1));
                Thread.sleep(34);
            }
        }
    }


    public static void main(String [] argv) throws InterruptedException {
        String currentDir = System.getProperty("user.dir");
        for (int i=1; i<=47; i++) {
            String path = currentDir + "/src/ru/mirea/task8/opt3/frames/ (" + i + ").png";
            Gif.add(new ImageIcon(path));
        }
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);

        Animation anim = new Animation();

        frame.add(anim);
        frame.add(Screen);
        frame.setVisible(true);

        anim.gif();

    }
}
