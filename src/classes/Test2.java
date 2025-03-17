package classes;

public class Test2 {
    public static void main(String[] args) {
//        classes.GamePlayer gamePlayer = new classes.GamePlayer(" Alina");
////        System.out.println(gamePlayer.makeChoice("камень"));
        Rectangle rectangle1 = new Rectangle( 22,5);
        double area1 = rectangle1.calculateArea();
        double p1 = rectangle1.calculateP();
        int a =8;
//        int a = 9;


        Rectangle rectangle2 = new Rectangle( 10,2);

        System.out.println(rectangle2.calculateP());

        Greeter greeter = new Greeter();
//        System.out.println(greeter.getGreeting("Alina"));
//        String gr = greeter.getGreeting("Anton");
    }
}
