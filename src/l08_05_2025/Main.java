package l08_05_2025;

import l29_04_2025.BMW;
import l29_04_2025.Car;
import l29_04_2025.Toyota;

public class Main {
    public static void main(String[] args) {
        int num = 45;
        Test.test(num);
        User user = new User("Алина");
        Test.test2(user);
        System.out.println(user.name);
//        printCard("Алина", "911");

        BMW bmw = new BMW("X5", "M11");
        Car carBmw = new BMW("X5", "M11");
        Car carToyota = new Toyota("bibi");
        System.out.println(bmw.conditioner);
        System.out.println(carBmw);
        printProperties(new Toyota(""));
        BMW car = new BMW("", 89);
        printProperties(car);
    }

    public static void printProperties(Car car) {
        System.out.println(car.model);
    }
//    public static void printCard(String name, String phoneNumber){
//        System.out.println(name + " " + phoneNumber);
//    }
//
//    public static void printCard(int age, String phoneNumber){
//        System.out.println(profession + " " + phoneNumber);
//    }
//
//    public static void printCard( String phoneNumber, int age,){
//        System.out.println(profession + " " + phoneNumber);
//    }
}
