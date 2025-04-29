package l29_04_2025;

public class BMW extends Car {
    String conditioner;
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

//    public void start(){
//        System.out.println("Быстро заводим машину");
//    }
}
