package final_package;

public class Test {
    public static void main(String[] args) {
//        User user = new User(1, "123", "123");
//        System.out.println(user.login);
//        user.id = 90;
//        user.changeLogin("NewLogin");
//        user.login = "dkjfk";
//        final int number;
//        number = 78;
////        number = 78;


//        User user1 = new User();

//        int a;
//        System.out.println(a);


//        final User user = new User(1, "123", "123");
//        user.login = "newLogin";
//        user = new User(2, "", "");
//класс Car с несколькими полями
//        int modelId - final
//        color


//      final Car car = new Car(2121,"Белый");

//        Сделать переменную car константой и попытаться
//        изменить свойство машины
//        присвоить в переменную car другой объект класса Car

//        car.modelId = 2323; (modelId  - константа)
//        car.color ="Черный";
//        car = new Car(23, "");
        User user1 = new User(1, "1", "1");
        User.printCounter();
        User user2 = new User(2, "2", "2");
        User.printCounter();
        User user3 = new User(3, "2", "3");
        User.printCounter();
        user1.setId(1);
//        System.out.println(user1.count);
//
//        System.out.println(User.count);
    }
}
