package Tests;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultiplesK {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int k = 7;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {

                System.out.println(array[i]);
            }

        }

    }
}
