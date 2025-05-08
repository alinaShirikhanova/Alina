package l29_04_2025;

public class BMW extends Car {
    public String conditioner;
    public BMW(String model, String conditioner) {
        super(model);
        this.conditioner = conditioner;
    }

    public BMW(String model, double price, String conditioner) {
        super(model, price);
        this.conditioner = conditioner;
    }

    public BMW(String model, double price) {
        super(model, price);
    }

    @Override
    public void start(){
        System.out.println("Быстро заводим машину");
    }

    public BMW getCar() {
        return new BMW("Toyota", "123");
    }
//    При переопределении возвращаемый тип переопределяемого
//    метода можно заменить на любой дочерний тип (Ковариантный тип)
}
