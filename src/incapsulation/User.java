package incapsulation;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
       this.setLogin(login);
       this.setPassword(password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login.length() > 5)
            this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        if (password.length() > 5)
            this.password = password;
    }
}
