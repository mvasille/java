package java1prac;

public class CommandArgsFor {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент #" + i + ": " + args[i]);
        }
    }
}
