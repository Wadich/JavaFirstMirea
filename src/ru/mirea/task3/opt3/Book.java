package ru.mirea.task3.opt3;

public class Book {
    private String author;
    private String name;
    private int creationYear;

    public Book(String author, String name, int creationDate) {
        this.author = author;
        this.name = name;
        this.creationYear = creationDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreationYear() {
        return this.creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", creationDate=" + creationYear +
                '}';
    }
}
