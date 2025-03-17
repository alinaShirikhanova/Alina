package classes;

public class Greeter {
    void sayHello() {
        System.out.println("Hello!");
        this.sayName();
        System.out.println("Метод sayHello отработал");
    }

    void sayName() {
        System.out.println("My name is Java");
        this.saySmth();
        System.out.println("Метод sayName отработал");
    }

    void saySmth() {
        System.out.println("Я крутая");
        System.out.println("Метод saySmth отработал");
    }
}
