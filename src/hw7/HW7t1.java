package hw7;

import java.util.Arrays;

public class HW7t1 {

    /* 1) Написати метод, який приймає як параметр масив цілих чисел.
    І виводить на екран усі парні числа списком, а також непарні числа списком.
     */
    public static void arrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Парні числа:" + arr[i]);
            }
            if (arr[i] % 2 != 0) {
                System.out.println("Непарні числа:" + arr[i]);
            }
        }
    }

    public static void main(String [] args) {
        HW7t1 variable = new HW7t1();
        int[] numbersInArray = {1,2,3,4,5,6,7,8,9,10};
        /*arrays(numbersInArray);*/
        variable.arrays(numbersInArray);
    }


}

