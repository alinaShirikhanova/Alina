package l29_04_2025;

public class Car {
    public String model;
    double price;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, double price) {
        this.price = price;
        this.model = model;
    }
//    public Car(){}

    public void start(){
        System.out.println("Заводим машину");
    }

    public Car getCar(){
        return new Car("Toyota");
    }
}

