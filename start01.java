
import java.util.Scanner;

public class start01 {
    // program that accept start with substring 01.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:?");
        String str = scanner.nextLine();
        boolean valid = validate37(str, str.length()); 
        System.out.println("The String is " + valid);
        scanner.close();
    }

    public static boolean  validate37(String str, int length){
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        for (char c : charArray) {
            if (c != '1' && c != '0') {
                return false;
            }
        }
        if (charArray[0] != '0') {
            return false;
        }
        if (charArray[1] != '1') {
            return false;
        }
        return true;
    }
}
