package ru.mirea.task6.opt1;

public class Book implements Nameable{
    private String name;

    public Book(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

