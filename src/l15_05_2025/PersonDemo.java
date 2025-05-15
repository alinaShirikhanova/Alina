package l15_05_2025;

import l29_04_2025.BMW;
import l29_04_2025.Car;
import l29_04_2025.Toyota;

public class PersonDemo {
    public static void main(String[] args) {
//        Smartphone smartphone = new Smartphone();
//        Person person = new Person(smartphone);

//        car = new Toyota("hsdj");

//        printProperties(car);
        Car car = new BMW("X5", 20.0);
        car.start();

//        Поли - много
//        морф - форм
    }

    public static void printProperties(Car car) {
        if (car instanceof BMW) {
            BMW bmw = (BMW) car;
        }
    }
}
//casting - преобразование
//instance - экземпляр

//Smartphone
//Iphone
