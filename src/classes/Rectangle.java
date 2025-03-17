package classes;

public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

     double calculateArea(){
//        double result = this.width * this.height;
//        return result;
         return this.width * this.height;
    }

    double calculateP() {
      return (width + height) * 2;
    }
}
