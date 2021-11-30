package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class App extends JFrame{
    private Background Border;

    public App() {
        super("App");
        this.setSize(800, 800);
        this.setResizable(false);
        Border = new Background();
        this.add(Border);

        addMouseMotionListener(new MouseListener());
    }

    public class MouseListener implements MouseMotionListener  {

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            message(e.getX(), e.getY());
        }
    }

    private void message(int x, int y) {
        if (java.lang.Math.pow(this.getWidth() / 2f - x, 2) + java.lang.Math.pow(this.getHeight() / 2f - y, 2) <= 400) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в Центр!");
        } else {
            if (-y > x - 800 && -y > -x) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Север!");
            } else if (-y > -x && -y < x - 800) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Восток!!");
            } else if (-y < x - 800 && -y < -x) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Юг!");
            } else if (-y > x - 800 && -y < -x) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Запад!");
            }
        }
    }
}
