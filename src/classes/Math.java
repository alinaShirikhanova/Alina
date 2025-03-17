package classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Math {
    int sym(int a, int b, int c) {
        return a + b + c;
    }


    int sym(int a, int b, int c, int n) {
        return a + b + c + n;
    }

    int sym(int... numbers){
        System.out.println(numbers);
        return 0;
    }
    double sym (double... numbers){
        System.out.println(Arrays.toString(numbers));
        return  0;
    }

}
