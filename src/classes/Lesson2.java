package classes;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(++a);
//        System.out.println(a);

//        a = a + 5;
//        a += 5;
//        a -= 5;
//        a *= 5;
//        a /= 5;
//        a %= 5;

//        Scanner scanner = new Scanner(System.in);
//        byte b = scanner.nextByte();
//        short s = scanner.nextShort();

//        long l = scanner.nextLong();
//        float f = scanner.nextFloat();
//        double d = scanner.nextDouble();
        // Эхо
        //Напишите программу, которая считывает из консоли целочисленное значение и выводит его в консоль.
        //
        //Пример ввода:
        //
        //12
        //Пример вывода:
        //
        //12
        //        int i = scanner.nextInt();
//        System.out.println(i);

//Калькулятор - 1
//На вход программе подается 2 числа, каждое на отдельной строке. Необходимо вывести в консоль сумму этих чисел.
//
//Пример ввода 1:
//
//5
//4
//Пример вывода 1:
//
//9
//        int i = scanner.nextInt();
//        int y = scanner.nextInt();
//        int sym = i + y ;
//        System.out.println(sym);


//Каждому по конфете
//На вход программе подается два целых числа - n - количество школьников и s  - количество конфет.
//
//Необходимо вывести количество целых конфет, которое достанется каждому школьнику, если разделить конфеты поровну.
//
//Пример ввода:
//
//5
//21
//Пример вывода:
//
//4
//        int n = scanner.nextInt();
//        int s = scanner.nextInt();
//        int k = s % n;
//        System.out.println(k);
//        System.out.println(21 % 5);
//


        //Какова скорость?
        //На вход программе подается два числа:
        //
        //s - путь пройденный велосипедистом
        //t - время пути велосипедиста
        //Необходимо вывести в консоль скорость велосипедиста.
        //
        //Формат ввода:
        //
        //s, t - целые числа, каждое на новой строке
        //
        //Формат вывода:
        //
        //Скорость велосипедиста в км/ч
        //
        //Пример ввода:
        //
        //30
        //6
//        int s = scanner.nextInt();
//        int t = scanner.nextInt();
//        int p = s / t;
//        System.out.println(p + " км/ч");



        //Next & previous
        //На вход программе подается целое число. Необходимо вывести в консоль предыдущее и следующее за ним число.
        //
        //Пробелы, знаки препинания, заглавные и строчные буквы важны!
        //
        //Пример ввода 1:
        //
        //10
        //Пример вывода 1:
        //
        //Следующее число для числа 10 - 11.
        //Предыдущее число для числа 10 - 9.
//        int h = scanner.nextInt();
//        // показать нюанс если сразу писать в print
//        int g = h + 1;
//        int w = h - 1;
//        System.out.println("Следующее число для числа " + h + " - " + g + ".");
//        System.out.println("Предыдущее число для числа 10 - 9.");
//
//
//        int n = scanner.nextInt();
//        int f = n / 1000;
//        int s = n / 100 % 10;
//        int t = n % 100 / 10;

//
//        System.out.println("Тысяч: " + f);
//        int i1 =10000000;
//        int i2 = 10000000;
//        double d1 = 50000.500;
//        double d2 = 100000.3;
//        long l = 20L;
//        double result = 0;
//        result = i2 * d1 + d2 * i1 * l;
//
//        System.out.println(10.6 % 2);

//        int a = 10;
//        int b = 12;
        // Неправильно
//        a = b;
//        b = a;
//        int temp = a;
//        a = b;
//        b = temp;






//        int a = 10;
//        int b = 12;
//        int s = a;
//        a = b;
//        b = s;
 

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = n / 1000 % 100  ;
        int w = n / 100 % 10;
        int e = n / 10 % 10;
        int r = n % 10;

        System.out.println("Тысяч: " + q);
        System.out.println("Cотен: " + w);
        System.out.println("Десятков: " + e);
        System.out.println("Единиц: " + r);
    }
}
