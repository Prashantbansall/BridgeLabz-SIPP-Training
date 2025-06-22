package javaString;
import java.util.Scanner;

public class StringCharacterComparison {
	
	public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] userDefinedArray = getCharacters(input);
        char[] builtInArray = input.toCharArray();
        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        System.out.println("User-defined method result:");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in method result:");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + result);
	}

}
