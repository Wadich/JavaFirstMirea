package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author test = new Author("test", "test@mail.ru", 'M');
        System.out.println(test.getEmail());
        System.out.println(test.getName());
        System.out.println(test.getGender());
        System.out.println(test.toString());
        test.setEmail("testNew@mail.ru");
        System.out.println(test.getEmail());
    }
}
