package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private JButton AnswerButton;
    private JTextField AnswerText;
    private JLabel Task;
    private JLabel Result;
    private int count, num;
    private JPanel[] allCell;

    public Game(){
        super("Game");

        num = (int) (Math.random() * 21);
        System.out.format("Num is %d\n", num);

        count = 0;

        AnswerButton = new JButton("Send");
        Task = new JLabel("Try to guess a number between 1 and 20, you have 3 attempts.");
        Result = new JLabel("Result: empty");
        AnswerText = new JTextField(2);

        this.setSize(600, 600);

        setLayout(new GridLayout(4, 1));

        allCell = new JPanel[4];

        for (int i = 0; i < 4; i++) {
            allCell[i] = new JPanel();
            this.add(allCell[i]);
        }

        allCell[0].add(Task);
        allCell[1].add(AnswerText);
        allCell[2].add(AnswerButton);
        allCell[3].add(Result);

        AnswerButton.addActionListener(new AnswerButtonListener());
    }

    public class AnswerButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (AnswerText.getText().equals("")) {
                return;
            }
            Task.setText("Try to guess a number between 1 and 20, you have " + (3 - count - 1) + " attempts." );
            if (count < 2) {
                if (AnswerText.getText().equals(String.valueOf(num))) {
                    count = 3;
                    Result.setText("Result: You are right!!!");
                } else {
                    count++;
                    if (Integer.parseInt(AnswerText.getText()) > num) {
                        Result.setText("Result: Wrong, try to take smaller number...");
                    } else {
                        Result.setText("Result: Wrong, try to take bigger number...");
                    }
                    AnswerText.setText("");
                }
            } else {
                Task.setText("Lucky next time :)" );
                Result.setText("Result: You've run out of attempts");

            }
        }
    }
}

