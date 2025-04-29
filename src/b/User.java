package b;

public class User {
    private String name;
    String login;
    int age;

    public User(String name, String login ){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean isAdult(int age){
        if (age >=18)
            return true;
        else
            return false;
    }
    public void validate(String line) {
        System.out.println(age);
        String correct = "abcdefjh";
        System.out.println(correct);
    }

    public void test(String name) {
        System.out.println(name);
        String a = "Hello";
        System.out.println(a);
    }

//    public void test2() {
//        System.out.println(a);
//    }
}