package final_package;

import java.util.Random;

public class User {
    final int id;
    String login;
    String password;
    public static int count = 0;

    public User(int id, String login, String password) {
        count++;
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User(int id, String login) {
        count++;
        this.login = login;
        this.id = id;
    }


    public static void printCounter() {
        System.out.println(User.count);
    }

    public void setId(int id){
        System.out.println(count);
        System.out.println(this.login);
    }

    public void changeLogin(final String login) {
//        login = "new";
    }

    public void printInfo() {

    }
}
