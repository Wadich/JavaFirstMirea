package ru.mirea.task5.opt2;

public abstract class Dog {
    private String description;
    private int age;
    private String name;

    public Dog(String description, int age, String name){
        this.age = age;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "description='" + this.description + '\'' +
                ", age=" + this.age +
                ", name='" + this.name + '\'' +
                '}';
    }
}
