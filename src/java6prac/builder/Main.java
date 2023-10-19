package java6prac.builder;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        builder.append("Hello, ");
        builder.append("world!");
        System.out.println(builder); // Вывод: Hello, world!

        builder.delete(7, 12);
        System.out.println(builder); // Вывод: Hello!

        builder.undo();
        System.out.println(builder); // Вывод: Hello, world!
    }
}