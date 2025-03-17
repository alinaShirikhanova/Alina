package incapsulation;

public class Test {
    public static void main(String[] args) {
        User user = new User("1000000", "pdjdghdjgh");

        User user1= new User("1232","1125");
        System.out.println(user1.getPassword());
        user1.setPassword("1");
        System.out.println(user1.getPassword());
//        System.out.println(user.getLogin());
//        user.setLogin("12345");

//        user.login = "1";
//        user.password = "1";
    }
}


//Создать класс Employee.
//Имя (name)
//Номер отдела (department) (1-5)
// Зарплата (>0) (salary)
