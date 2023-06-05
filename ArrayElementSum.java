package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class ArrayElementSum {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        var sum = 0;
        for (int value : array) {
            sum+= value;
        }
        System.out.println(sum);
    }

}
