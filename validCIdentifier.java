import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class validCIdentifier {
    // Set to store C keywords
    private static final Set<String> keywords = new HashSet<>();

    static {
        // Initialize the set with C keywords
        String[] cKeywords = {"auto", "break", "case", "char", "const", "continue",
                "default", "do", "double", "else", "enum", "extern",
                "float", "for", "goto", "if", "int", "long", "register",
                "return", "short", "signed", "sizeof", "static", "struct",
                "switch", "typedef", "union", "unsigned", "void", "volatile", "while"};

        for (String keyword : cKeywords) {
            keywords.add(keyword);
        }
    }

    // Function to check if a string is a valid C identifier
    public static boolean isValidIdentifier(String identifier) {
        // Check if the first character is a letter or underscore
        if (!(Character.isLetter(identifier.charAt(0)) || identifier.charAt(0) == '_')) {
            return false;
        }

        // Check the rest of the characters
        for (int i = 1; i < identifier.length(); i++) {
            if (!(Character.isLetterOrDigit(identifier.charAt(i)) || identifier.charAt(i) == '_')) {
                return false;
            }
        }

        // Check if it is a C keyword
        return !keywords.contains(identifier);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an identifier: ");
        String input = scanner.nextLine(); // Use nextLine() to read entire line

        if (isValidIdentifier(input)) {
            System.out.println("Valid C Identifier");
        } else {
            System.out.println("Not a Valid C Identifier");
        }

        scanner.close();
    }
}
