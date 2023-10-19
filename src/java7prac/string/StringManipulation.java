package java7prac.string;

public interface StringManipulation {
    // Функция подсчета символов в строке
    int countCharacters(String s);

    // Функция возвращает строку, составленную из символов на нечетных позициях
    String oddPositionCharacters(String s);

    // Функция инвертирования строки
    String reverseString(String s);
}
