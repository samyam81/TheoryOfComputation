import java.util.Scanner;

public class equal {
    // program that accept string with equal number of 1 and 0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:?");
        String str = scanner.nextLine();
        boolean valid = validate38(str, str.length()); 
        System.out.println("The String is " + valid);
        scanner.close();
    }

    public static boolean validate38(String str, int length) {
        int a1 = 0;
        int a0 = 0;
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = str.charAt(i);
        }
        for (char c : charArray) {
            if (c != '1' && c != '0') {
                return false;
            }
        }
        for (char c : charArray) {
            if (c == '0') {
                a0++;
            } 
            if (c == '1') {
                a1++;
            }
        }
        return a1 == a0;
    }
}
