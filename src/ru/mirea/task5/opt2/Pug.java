package ru.mirea.task5.opt2;

public class Pug extends Dog {
    public Pug(String description, int age, String name){
        super(description, age, name);
    }

    @Override
    public String toString() {
        return "Pug{" +
                "description='" + this.getDescription() + '\'' +
                ", age=" + this.getAge() +
                ", name='" + this.getName() + '\'' +
                '}';
    }

}
