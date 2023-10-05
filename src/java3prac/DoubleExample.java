package java3prac;

public class DoubleExample {
    public static void main(String[] args) {
        // 1. Создание объектов класса Double с использованием метода valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // 2. Преобразование значения типа String в тип double с использованием Double.parseDouble()
        String str = "5.0";
        double parsedDouble = Double.parseDouble(str);

        // 3. Преобразование объекта Double ко всем примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        byte primitiveByte = doubleObj1.byteValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        float primitiveFloat = doubleObj1.floatValue();
        short primitiveShort = doubleObj1.shortValue();

        // 4. Вывод значения объекта Double на консоль
        System.out.println("doubleObj1 = " + doubleObj1);
        System.out.println("doubleObj2 = " + doubleObj2);

        // 5. Преобразование литерала типа double в строку
        String d = Double.toString(3.14);
        System.out.println("d = " + d);
    }
}
