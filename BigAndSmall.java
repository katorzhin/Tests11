package strings;

import java.util.Scanner;

public class BigAndSmall {
    public static void main(String[] args) {
        int upperCaseLetters = 0;
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])){
                upperCaseLetters++;
            }
        }
        System.out.println(upperCaseLetters);
        System.out.println(  chars.length-upperCaseLetters);
//        Character.low
    }
}
