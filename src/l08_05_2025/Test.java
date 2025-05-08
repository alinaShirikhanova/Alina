package l08_05_2025;

public class Test {
    public static void test(int number) {
        number = 10;
    }

    public static void test2(User user){
        user = new User("jdfjdfh");
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}
