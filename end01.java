import java.util.Scanner;

public class end01 {
// the Code only accept the string that end with 01.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:?");
        String str = scanner.nextLine();
        boolean valid = validate39(str); 
        System.out.println("The String is " + valid);
        scanner.close();
    }

    public static boolean validate39(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        for (char c : charArray) {
            if (c != '1' && c != '0') {
                return false;
            }
        }
        if (charArray[str.length() - 1] != '1') {
            return false;
        }
        if (charArray[str.length() - 2] != '0') {
            return false;
        }
        return true;
    }
}
