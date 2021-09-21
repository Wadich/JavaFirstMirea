package ru.mirea.task6.opt1;

public class Cars implements Nameable{
    private String name;

    public Cars(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                '}';
    }
}
