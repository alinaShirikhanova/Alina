package a;

public class Car {
    // Поля класса (переменные экземпляра)
    private String color;
    private String model;

    // Статическая переменная для подсчёта количества созданных объектов
    public static int count = 0;

    // Конструктор с параметрами
    public Car(String color, String model) {
        // Ключевое слово this используется для различения параметров и полей экземпляра
        System.out.println(this);
        this.color = color;
        this.model = model;
        count++; // Увеличиваем счетчик при создании нового объекта
    }


    public void calculate(int a, int b, int c){
        calculatePart1(a,b,c);
    }

    private void calculatePart1(int a, int b, int c){
        // очень сложный код
    }


    // Метод, который выводит цвет автомобиля
    private void showColor() {
        System.out.println("Цвет машины: " + this.color);
    }

    // Метод, который изменяет цвет автомобиля
    public void changeColor(String newColor) {
        System.out.println("Цвет машины изменяется с " + this.color + " на " + newColor);
        this.color = newColor;
        // Допустим, изменение цвета влияет на стоимость
    }

    // Статический метод для вывода общего количества машин
    public static void showCount() {
        System.out.println("Всего создано машин: " + count);
    }

    // Пример использования локальных переменных внутри метода
    public void printInfo(String extraInfo) {
        int localPrice = 5000; // Локальная переменная, видна только в этом методе
        System.out.println("Модель: " + this.model + ", Цвет: " + this.color);
        System.out.println("Дополнительная информация: " + extraInfo);
        System.out.println("Начальная цена: " + localPrice);
    }
}
