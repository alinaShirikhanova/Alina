package classes;

public class Cat {
    String breed;
    String color;
    int age;

    Cat(String p, String c, int a) {
        this.breed = p;
        this.color = c;
        this.age = a;
    }

    void changeValues(Cat cat){
        cat.breed = "Другое значение";
    }

    void changeValue(int number){
        number = 89;
    }

    String changeValue(String line){
        line = "Другая строка";
        return line;
    }

}

