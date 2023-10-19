package java7prac.string;

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        ProcessStrings stringProcessor = new ProcessStrings();

        // Подсчет символов в строке
        int characterCount = stringProcessor.countCharacters(inputString);
        System.out.println("Количество символов в строке: " + characterCount);

        // Получение строки из символов на нечетных позициях
        String oddChars = stringProcessor.oddPositionCharacters(inputString);
        System.out.println("Символы на нечетных позициях: " + oddChars);

        // Инвертирование строки
        String reversedString = stringProcessor.reverseString(inputString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}