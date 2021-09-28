package ru.mirea.task5.opt2;

public class Bulldog extends Dog{
    public Bulldog(String description, int age, String name){
        super(description, age, name);
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "description='" + this.getDescription() + '\'' +
                ", age=" + this.getAge() +
                ", name='" + this.getName() + '\'' +
                '}';
    }
}
