package javaString;
import java.util.Scanner;

public class SubstringComparison {
	
	public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String customSubstring = createSubstringUsingCharAt(input, start, end);
        String builtInSubstring = input.substring(start, end);
        boolean result = compareStrings(customSubstring, builtInSubstring);

        System.out.println("Custom Substring: " + customSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);
	}

}
