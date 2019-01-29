package Tests;

public class Tests1 {

    int summMass(int a[][]) {

        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                summ += a[i][j];
            }
        }
        System.out.println("Sum of all array elements" + summ);
        return summ;
    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        //int sum = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // sum +=  args[i][j];

                System.out.print(" " + array[i][j]);


            }
            System.out.println();


        }


    }

}


