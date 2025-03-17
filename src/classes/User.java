package classes;

class User {
    private String login;
    private String password;

    User(String l, String p) {
        if (l.length() > 3)
            this.login = l;
        if (p.length() > 3)
            this.password = p;
    }

    String getLogin(){
        return login;
    }

    void setLogin(String login){
        if (login.length() > 3)
            this.login = login;
    }













    void changeValue(String value){
        value = "другое значение";
    }

















    // void - пустота
    void printInfo() {
        System.out.println("Логин: " + this.login);
        System.out.println("Пароль: " + this.password);
    }
}
