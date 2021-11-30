package ru.mirea.task12.opt2;

import ru.mirea.task12.opt1.student;

public class Student extends student {
    private int mark;

    public Student(String name, int mark) {
        super(name);
        this.mark = mark;
    }

    public Student() {
        super();
        this.mark = (int)(Math.random() * 10);
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", id=" + getId() +
                ", mark=" + mark +
                '}';
    }
}
