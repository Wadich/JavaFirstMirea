package ru.mirea.task8.opt1;

import ru.mirea.task7.opt1.Circle;
import ru.mirea.task7.opt1.Rectangle;

import javax.swing.*;
import java.awt.*;


public class Window extends JPanel {
    public void paintComponent(Graphics graphics) {
        this.setBackground(Color.white);

        int randInt = 0;
        int randColor = 0;
        for (int i = 0; i < 20; i++) {
            do {
                randInt = (int) (Math.random() * 10);
            } while (randInt > 1);

            switch (randInt) {
                case 0:
                    Circle circle = new Circle();

                    randInt = (int) (Math.random() * 101) + 10;
                    circle.setRadius(randInt);

                    randColor = (int) (Math.random() * 5);
                    switch (randColor) {
                        case 0:
                            circle.setColor("black");
                            graphics.setColor(Color.BLACK);
                            break;
                        case 1:
                            circle.setColor("red");
                            graphics.setColor(Color.RED);
                            break;
                        case 2:
                            circle.setColor("blue");
                            graphics.setColor(Color.BLUE);
                            break;
                        case 3:
                            circle.setColor("green");
                            graphics.setColor(Color.GREEN);
                            break;
                        case 4:
                            circle.setColor("pink");
                            graphics.setColor(Color.PINK);
                            break;
                    }

                    graphics.drawOval((int) (Math.random() * 750),
                            (int) (Math.random() * 750),
                            (int) circle.getRadius(), (int) circle.getRadius());
                    break;
                case 1:
                    Rectangle rectangle = new Rectangle();

                    randInt = (int) (Math.random() * 101) + 10;
                    rectangle.setWidth(randInt);
                    randInt = (int) (Math.random() * 101) + 10;
                    rectangle.setLength(randInt);

                    randColor = (int) (Math.random() * 5);
                    switch (randColor) {
                        case 0:
                            rectangle.setColor("black");
                            graphics.setColor(Color.BLACK);
                            break;
                        case 1:
                            rectangle.setColor("red");
                            graphics.setColor(Color.RED);
                            break;
                        case 2:
                            rectangle.setColor("blue");
                            graphics.setColor(Color.BLUE);
                            break;
                        case 3:
                            rectangle.setColor("green");
                            graphics.setColor(Color.GREEN);
                            break;
                        case 4:
                            rectangle.setColor("pink");
                            graphics.setColor(Color.PINK);
                            break;
                    }

                    graphics.drawRect((int) (Math.random() * 750),
                            (int) (Math.random() * 750),
                            (int) rectangle.getWidth(), (int) rectangle.getLength());
            }

        }


    }


}