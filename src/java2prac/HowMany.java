package java2prac;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        System.out.println("Количество слов в введенной строке: " + wordCount);

        scanner.close();
    }
}
