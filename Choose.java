package Tests;

import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        System.out.println("Choose a (tree/square)? ");

        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();

        while (choose.equals("tree")) ;
        System.out.println("\t\t  /\\");
        System.out.println("\t\t /  \\" + "\n\t\t/ || \\" + "\n\t   /  ||  \\" + "\n\t  /   ||   \\" + "\n\t /    ||\t\\");
        System.out.println("\t/\t  ||\t \\" + "\n\t\t  ||");
        System.out.println("   ----------------");
    }
}
