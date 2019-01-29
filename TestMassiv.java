package Horstman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestMassiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to guess? ");
        int k = scanner.nextInt();

        System.out.print("What is the highest number you can guess? ");
        int n = scanner.nextInt();

        ///заполняем массив числами 1 2 3 ...n

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
            // выбираем k номеров и помещаем их во второй массив
            int[] result = new int[k];
            for (int i = 0; i < result.length; i++) {

                //получаем случайный индекс в пределах от 0 до n-1
                int r =(int)(Math.random()*n);

                //выбираем элемент из произвольного места
                result[i]=numbers[r];

                //переместим последний элемент в произвольное место
                numbers[r]=numbers[n-1];
                n--;
                }
             //выведем отсортированный массив
            Arrays.sort(result);
        System.out.println("Bet the following combination.It'll make you rich!");
        for(int r:result)
            System.out.println(r);


    }

}
