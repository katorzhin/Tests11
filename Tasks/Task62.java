package Tasks;

public class Task62 {
    public static void main(String[] args) {
        System.out.println(getZeroCount(1, 3, 5, 5, 7, 0, 9, 9, 3, 5, 0, 0, 0, 0, 5));
    }

    public static int getZeroCount(int... numbers) {
        int tempZeroCount = 0;
        int countMax = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                tempZeroCount++;
            } else {
                countMax = (countMax > tempZeroCount) ? countMax : tempZeroCount;
                tempZeroCount = 0;
            }
            if (numbers[i]==0&&numbers.length-1==i){
                countMax = (countMax > tempZeroCount) ? countMax : tempZeroCount;
                tempZeroCount = 0;
            }
        }
        return countMax;
    }
}
