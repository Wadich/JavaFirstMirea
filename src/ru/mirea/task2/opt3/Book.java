package ru.mirea.task2.opt3;

public class Book {
    private final String name;
    private final String author;
    private final int pageNum;

    public Book(String name, String author, int pageNum) {
        this.name = name;
        this.author = author;
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}
