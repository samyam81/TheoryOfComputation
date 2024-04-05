import java.util.Scanner;

public class substring010 {
    // program that accept string with substring 010.
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:?");
        String str = scanner.nextLine();
        boolean valid = validate36(str, str.length()); 
        System.out.println("The String is " + valid);
        scanner.close();
    }

    public static boolean validate36(String str,int length){
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        for (char c : charArray) {
            if (c != '1' && c != '0') {
                return false;
            }
        }
        for (int i = 0; i < length-3; i++) {
            if (charArray[i]=='0'
            &&
            charArray[i+1]=='1'
            &&
            charArray[i+2]=='0') {
                return true;                
            }
        }
        return false;
    }

}
