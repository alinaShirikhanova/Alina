package l15_05_2025;

public class Person {
    Smartphone smartphone;

    public Person(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public void call(){
        smartphone.call();
    }
}
