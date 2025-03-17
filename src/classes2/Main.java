package classes2;

public class Main {
    public static void main(String[] args) {
//        "\n" - символ перехода на следующую строку
//        конкатенация - склеивание строк
//        int s = 12;
//        int s2 = 12;
//        System.out.println(s + "" + s2 + " ");
//        System.out.println("Hello" + "friends");
//        System.out.print("Hello");
//        System.out.println("Hello");
//
////        byte short int
//        byte first = 1;
//        byte second = 1;
////        short res = first + second;
//        int num = 1;
//        num = 130;
//        byte y = (byte) num; // явное преобразование
//        int number = y; // неявное преобразование
//        System.out.println(y);
//        int res = (int) Math.random();
////        тип переменной назначения = (тип переменной назначения)
//
//        char sym = 12;
//
//        String line = "Hello";
//        System.out.println(line);
        int intNumber = 65;

        char symbol = (char) intNumber;
        System.out.println(symbol + " " + symbol);
    }
}

// Двоичное представление (32-бита, int):
//
//00000000 00000000 00000000 10000010
//После преобразования в byte:
//Берутся только последние 8 бит:
//
//10000010

