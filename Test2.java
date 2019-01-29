package Tests;

public class Test2 {

    public void printMatrix(int a[][]) {
        int x = a.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int summMass(int a[][]) {
        int x = a.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += a[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + summ);
        return summ;
    }

    public void summString(int a[][]) {
        int x = a.length;
        int Str1 = 0, Str2 = 0, Str3 = 0;
        for (int i = 0; i < x; i++) {
            Str1 += a[0][i];
        }
        System.out.println("Сумма елементов первой строки равна: " + Str1);
        for (int i = 0; i < x; i++) {
            Str2 += a[1][i];
        }
        System.out.println("Сумма елементов второй строки равна: " + Str2);
        for (int i = 0; i < x; i++) {
            Str3 += a[2][i];
        }
        System.out.println("Сумма елементов третьей строки равна: " + Str3);
    }

    public void summKolon(int a[][]) {
        int x = a.length;
        int Str1 = 0, Str2 = 0, Str3 = 0;
        for (int i = 0; i < x; i++) {
            Str1 += a[i][0];
        }
        System.out.println("Сумма елементов первого столбца равна: " + Str1);
        for (int i = 0; i < x; i++) {
            Str2 += a[i][1];
        }
        System.out.println("Сумма елементов второго столбца равна: " + Str2);
        for (int i = 0; i < x; i++) {
            Str3 += a[i][2];
        }
        System.out.println("Сумма елементов третьего столбца равна: " + Str3);
    }

    public void summDiag(int a[][]) {
        int x = a.length;
        int Str1 = 0, Str2 = 0;
        Str1 += a[0][0] + a[1][1] + a[2][2];
        System.out.println("Сумма елементов 1 диагонали равна: " + Str1);
        Str2 += a[0][2] + a[1][1] + a[2][0];
        System.out.println("Сумма елементов 2 диагонали равна: " + Str2);
    }


    public static void main(String args[]) {
        int a[][] = new int[3][3];
        a[0][1] = 1;
        a[1][0] = 2;
        a[0][0] = 3;
        a[1][1] = 4;
        a[0][2] = 5;
        a[1][2] = 6;
        a[2][2] = 7;
        a[2][1] = 8;
        a[2][0] = 9;
        Test2 mhw = new Test2();
        mhw.printMatrix(a);
        mhw.summMass(a);
        mhw.summString(a);
        mhw.summKolon(a);
        mhw.summDiag(a);
    }
}


