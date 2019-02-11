package Horstman;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        // Выделяем память под треугольный массив

        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];


        //заполняем треугольный массив
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * вычисляем биноминальный коэфициент:
                 * n*(n-1)*(n-2)*....*(n-k+1)/(1*2*3*.....*k)
                 */
                int lotteryOds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOds=lotteryOds*(n-i+1)/i;

                odds[n][k]=lotteryOds;

            }

            //выведем треугольный массив
        for (int []row : odds){
            for(int odd:row)
                System.out.printf("%4d",odd);
            System.out.println();
        }

    }

}
