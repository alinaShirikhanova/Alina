package classes;

public class MathTest {
    public static void main(String[] args) {
        Math math = new Math();

        math.sym(1, 2, 3, 4, 5, 6, 7);
        math.sym(1, 2, 3, 4, 5, 6, 7, 56, 67);
        int[] array = {1, 2, 3, 4};
        math.sym(array);
    }
}
