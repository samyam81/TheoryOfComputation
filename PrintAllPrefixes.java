import java.util.Scanner;

public class PrintAllPrefixes {
    // program that print all the possible prefixes.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.next();
        System.out.println("\nAll prefixes are:\n");
        printAllPrefixes(s);
        scanner.close();
    }

    public static void printAllPrefixes(String str) {
        int l = str.length();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}

