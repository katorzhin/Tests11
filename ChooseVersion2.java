import java.util.Scanner;

public class ChooseVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите елка(in english): ");
        String tree = scanner.nextLine();
        if (tree.equals("tree")) {
            System.out.println("\t\t  /\\");
            System.out.println("\t\t /  \\" + "\n\t\t/ || \\" + "\n\t   /  ||  \\" + "\n\t  /   ||   \\" + "\n\t /    ||\t\\");
            System.out.println("\t/\t  ||\t \\" + "\n\t\t  ||");
            System.out.println("   ----------------");

        } else {
            System.out.println("wtf man?)");
            return;
        }
    }


}

